package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

/**
 * This class should tell us the balance of the customer's account
 */

public class Transaction extends Screen{

    private BufferedReader consoleReader;
    private ScreenRouter router;

    public Transaction(BufferedReader consoleReader, ScreenRouter router) {
        super("Transaction", "/balance");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    public void render(){
        System.out.println("This is where the total amount/balance would be implemented");
    }
}
