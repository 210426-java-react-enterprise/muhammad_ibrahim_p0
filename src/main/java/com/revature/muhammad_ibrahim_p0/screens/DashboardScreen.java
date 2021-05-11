package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

public class DashboardScreen extends Screen{

    private BufferedReader consoleReader;
    private ScreenRouter router;

    public DashboardScreen (BufferedReader consoleReader, ScreenRouter router) {
        super("DashboardScreen", "/dashboard");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    public void render() {

        String firstname;
        String lastname;

        try {

            System.out.println("+**************************************");
            System.out.printf("Welcome to your dashboard %s! \n\nWhat would you like to do today?");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
