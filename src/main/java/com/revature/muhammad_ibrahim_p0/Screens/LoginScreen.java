/**
 * LoginScreen
 * This is screen is where the app user is allowed to login into their existing account.
 * */

package com.revature.muhammad_ibrahim_p0.Screens;

import java.io.BufferedReader;
import java.io.IOException;

public class LoginScreen {
    private BufferedReader consoleReader;

    public LoginScreen(BufferedReader consoleReader) { this.consoleReader = consoleReader;}

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

        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
