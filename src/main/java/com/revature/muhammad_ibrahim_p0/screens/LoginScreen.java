/**
 * LoginScreen
 * This is screen is where the app user is allowed to login into their existing account.
 * */

package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.models.Customer;

import java.io.BufferedReader;
import java.io.IOException;

public class LoginScreen extends Screen {

    private UserDAO userDAO = new UserDAO();
    private BufferedReader consoleReader;

    public LoginScreen(BufferedReader consoleReader) {
        super("LoginScreen", "/login");
        this.consoleReader = consoleReader;}

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
               }
               else{
                   System.out.println("Login Failed!");
               }
            }
            else{
                System.out.println("Please provide login credentials!");
            }


        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
