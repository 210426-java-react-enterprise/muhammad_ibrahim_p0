package com.revature.muhammad_ibrahim_p0.util;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.screens.HomeScreen;
import com.revature.muhammad_ibrahim_p0.screens.LoginScreen;
import com.revature.muhammad_ibrahim_p0.screens.RegisterScreen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppState {

    private BufferedReader consoleReader;
    private ScreenRouter router;
    private boolean appRunning;

    public AppState() {

        System.out.println("Initializing Application");

        appRunning = true;
        consoleReader = new BufferedReader(new InputStreamReader(System.in));

        final UserDAO userDAO = new UserDAO();

        router = new ScreenRouter();
        router.addScreen(new HomeScreen(consoleReader, router))
                .addScreen(new RegisterScreen(consoleReader))
                .addScreen(new LoginScreen(consoleReader));

        System.out.println("Application Initialized");
    }

    public BufferedReader getConsoleReader() {
        return consoleReader;
    }

    public ScreenRouter getRouter() {
        return router;
    }

    public boolean isAppRunning() {
        return appRunning;
    }

    public void setAppRunning(boolean appRunning) {
        this.appRunning = appRunning;
    }

}
