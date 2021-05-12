package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

public class AccountsScreen extends Screen{

    private BufferedReader consoleReader;
    private ScreenRouter router;

    public AccountsScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("AccountsScreen", "/accounts");
        this.consoleReader = consoleReader;
        this.router = router;
    }
    public void render(){
        System.out.println("This is where the account creation would be implemented");

        
    }
}
