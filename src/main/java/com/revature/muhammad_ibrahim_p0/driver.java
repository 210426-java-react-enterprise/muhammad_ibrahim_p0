/**
 * The main method for the program where all the other codes meet.
 * */

package com.revature.muhammad_ibrahim_p0;

import com.revature.muhammad_ibrahim_p0.Screens.HomeScreen;
import com.revature.muhammad_ibrahim_p0.models.HumanUsers;

public class driver {

    public static void main(String[] args) {

        HomeScreen welcome = new HomeScreen();
        welcome.render();

    }
}
