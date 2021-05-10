/**
 * 05/05/21
 * This is a specific use case that has all the info collection for registering user.
 *
 *
* */

package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.models.HumanUsers;

import java.io.BufferedReader;

public class RegisterScreen extends Screen{

    private UserDAO userDAO = new UserDAO();
    private BufferedReader consoleReader;

    public RegisterScreen(BufferedReader consoleReader){
        super("RegisterScreen", "/register");
        this.consoleReader = consoleReader;}

    public void render() {
        String firstname;
        String lastname;
        String username;
        String password;
        String email;
        String phone_number;
        // The above are locally scoped and don't get initialized

        try{
            System.out.println("+******************************+");
            System.out.println("Register for a new profile");
            System.out.println("+******************************+");

            System.out.print("First name: ");
            firstname = consoleReader.readLine();

            System.out.print("Last name: ");
            lastname = consoleReader.readLine();

            System.out.print("User name: ");
            username = consoleReader.readLine();

            System.out.print("Password: ");
            password = consoleReader.readLine();

            System.out.print("Email: ");
            email = consoleReader.readLine();

            System.out.print("Phone number: ");
            phone_number = consoleReader.readLine();

            HumanUsers newUser = new HumanUsers(username, password, firstname,lastname, email, phone_number);
            System.out.println("HumanUsers constructor invoked!");
            System.out.println("New user created with the profile: " + newUser);
            userDAO.saveUserToFile(newUser);


        }catch (Exception e){

        }
    }
}
