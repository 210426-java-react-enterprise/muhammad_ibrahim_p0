package com.revature.muhammad_ibrahim_p0.Screens;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeScreen {

    public void render(){

        System.out.println("+******************************+");
        System.out.println("*****WELCOME TO WIDAD BANK******");
        System.out.println("Press 1 to Register");
        System.out.println("Press 2 to login");
        System.out.println("Press 3 to Exit");


        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(">> ");
            String userInput = consoleReader.readLine();

            switch (userInput){
                case "1":
                    System.out.println("Navigating to the Register screen");
                    RegisterScreen registerScreen = new RegisterScreen(consoleReader);
                    registerScreen.render();
                    break;
                case "2":
                    System.out.println("Navigating to the Login screen");
                    break;
                default:
                    System.out.println("Invalid selection!");
            }



            RegisterScreen registerScreen = new RegisterScreen(consoleReader);
            registerScreen.render();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
