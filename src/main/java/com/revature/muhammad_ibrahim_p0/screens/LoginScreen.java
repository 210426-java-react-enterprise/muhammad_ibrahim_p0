/**
 * LoginScreen
 * This is screen is where the app user is allowed to login into their existing account.
 * */

package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.models.Customer;
import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;
import java.io.IOException;

public class LoginScreen extends Screen {

    private UserDAO userDAO = new UserDAO();
    private BufferedReader consoleReader;
    private ScreenRouter router;

    public LoginScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("LoginScreen", "/login");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    public void render(){
        String username;
        String password;

        try{
            System.out.println("+******************************+");
            System.out.println("\t\tLogin to your profile");
            System.out.println("+******************************+");

            System.out.print("Username: ");
            username = consoleReader.readLine();

            System.out.print("Password: ");
            password = consoleReader.readLine();

            if(username != null && !username.isEmpty() && password != null && !password.isEmpty()){
               Customer confirmUser = userDAO.findUserByUsernameAndPassword(username,password);
               if (confirmUser != null) {
                   System.out.println("Login Successful!");
                   router.navigate("/dashboard");
               }
               else{
                   System.out.println("Login Failed!");
                   router.navigate("/welcome");
               }
            }
            else{
                System.out.println("Please provide login credentials!");
                router.navigate("/welcome");
            }


        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
