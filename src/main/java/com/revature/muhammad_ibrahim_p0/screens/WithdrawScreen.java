package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

public class WithdrawScreen extends Screen{

    private BufferedReader consolereader;
    private ScreenRouter router;

    public WithdrawScreen (BufferedReader consolereader, ScreenRouter router) {
        super("WithdrawScreen", "withdraw");
        this.consolereader = consolereader;
        this.router = router;
    }

    public void render() {
        System.out.println("This is where the withdraw function would be implemented");
    }
}
