package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

import static com.revature.muhammad_ibrahim_p0.Driver.app;

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

        System.out.println("+**************************************");
        System.out.println("Welcome to your dashboard %s! \n\nHere's info on your account.");
        System.out.println("What would you like to do today?");
        System.out.println("Press 1 to Open a new account");
        System.out.println("Press 2 to Deposit");
        System.out.println("Press 3 to Withdraw");
        System.out.println("Press 4 to Exit the application");

        try {

            System.out.print(">> ");
            String userInput = consoleReader.readLine();

            switch (userInput) {
                case "1":
                    System.out.println("Lets create a new account for you!\n\nLoading...\n\n");
                    router.navigate("/accounts");
                    break;
                case "2":
                    System.out.println("DEPOSIT");
                    router.navigate("/deposit");
                    break;
                case "3":
                    router.navigate("/withdraw");
                    break;
                case "4":
                    System.out.println("Exiting the application!");
                    app().setAppRunning(false);
                    break;
                default:
                    System.out.println("Invalid selection!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
