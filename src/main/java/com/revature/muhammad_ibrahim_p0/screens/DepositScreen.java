package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

public class DepositScreen extends Screen{

    private BufferedReader consoleReader;
    private ScreenRouter router;

    public DepositScreen (BufferedReader consoleReader, ScreenRouter router) {
        super("DepositScreen", "/deposit");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    public void render() {
        System.out.println("This is where the deposit would be implemented");
    }
}
