package com.revature.muhammad_ibrahim_p0.util;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.screens.*;
import com.revature.muhammad_ibrahim_p0.services.UserService;

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
        final UserService userService = new UserService(userDAO);

        router = new ScreenRouter();
        router.addScreen(new HomeScreen(consoleReader, router))
                .addScreen(new RegisterScreen(consoleReader, userService, router))
                .addScreen(new LoginScreen(consoleReader,router))
                .addScreen(new DashboardScreen(consoleReader, router))
                .addScreen(new AccountsScreen(consoleReader,router))
                .addScreen(new DepositScreen(consoleReader, router))
                .addScreen(new WithdrawScreen(consoleReader,router))
                .addScreen(new TransactionScreen(consoleReader, router));

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
