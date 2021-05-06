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



            RegisterScreen registerScreen = new RegisterScreen(consoleReader);
            registerScreen.render();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
