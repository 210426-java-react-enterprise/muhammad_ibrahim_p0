package com.revature.muhammad_ibrahim_p0.util;

import com.revature.muhammad_ibrahim_p0.screens.Screen;

/**
 * ScreenRouter: This holds a linked list of all screens and would have a method that can be called to navigate
 * between screens and it gives a pre-made screen.
 *
 * */
public class ScreenRouter {

    private LinkedList<Screen> screens = new LinkedList<>();

    // psuedo representation of builder pattern
    public ScreenRouter addScreen(Screen screen) {
        screens.add(screen);
        return this;
    }

    public void navigate(String route) {
        for (int i = 0; i < screens.size(); i++) {
            Screen screen = screens.get(i);
            if (screen.getRoute().equals(route)) {
                screen.render();
            }
        }
    }
}
