/**
 * Welcome/Landing page
 * This is the home page of the application
 * */

package com.revature.muhammad_ibrahim_p0.screens;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.revature.muhammad_ibrahim_p0.screens.LoginScreen;
import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;
import static com.revature.muhammad_ibrahim_p0.Driver.app;

public class HomeScreen extends Screen {
    private BufferedReader consoleReader;
    private ScreenRouter router;


    // dependency injection allows us to inject router into HomeScreen
    public HomeScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("HomeScreen", "/welcome");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    @Override
    public void render(){

        System.out.println("+******************************+");
        System.out.println("*****WELCOME TO WIDAD BANK******");
        System.out.println("Press 1 to Register");
        System.out.println("Press 2 to login");
        System.out.println("Press 3 to Exit");


        try {
            System.out.print(">> ");
            String userInput = consoleReader.readLine();

            switch (userInput){
                case "1":
                    System.out.print("Navigating to the Register screen");
                    RegisterScreen registerScreen = new RegisterScreen(consoleReader);
                    // registerScreen.render();
                    router.navigate("/register");
                    break;
                case "2":
                    System.out.println("Navigating to the Login screen");
                    LoginScreen loginScreen = new LoginScreen(consoleReader);
                    // loginScreen.render();
                    router.navigate("/login");
                    break;
                case "3":
                    System.out.println("Exiting the application!");
                    app().setAppRunning(false);
                    break;
                default:
                    System.out.println("Invalid selection!");
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
