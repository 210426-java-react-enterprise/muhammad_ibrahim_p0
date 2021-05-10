package com.revature.muhammad_ibrahim_p0;
/**
 * The main method for the program where all the other codes meet.
 * */

import com.revature.muhammad_ibrahim_p0.screens.HomeScreen;
import com.revature.muhammad_ibrahim_p0.models.HumanUsers;
import com.revature.muhammad_ibrahim_p0.util.AppState;

public class Driver {

    private static AppState app = new AppState();

    public static void main(String[] args) {

        while (app.isAppRunning()){
            app.getRouter().navigate("/welcome");
        }

    /*    HomeScreen welcome = new HomeScreen();
        //welcome.render();
        router.navigate("/welcome");*/

    }

    public static AppState app(){
        return app;
    }
}
