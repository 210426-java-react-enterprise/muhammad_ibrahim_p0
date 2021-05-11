/**
 * 05/05/21
 * This is a specific use case that has all the info collection for registering user.
 *
 *
* */

package com.revature.muhammad_ibrahim_p0.screens;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.exceptions.InvalidRequestException;
import com.revature.muhammad_ibrahim_p0.exceptions.ResourcePersistenceException;
import com.revature.muhammad_ibrahim_p0.models.Customer;
import com.revature.muhammad_ibrahim_p0.services.UserService;
import com.revature.muhammad_ibrahim_p0.util.ScreenRouter;

import java.io.BufferedReader;

public class RegisterScreen extends Screen{

    private UserService userService;
    private BufferedReader consoleReader;
    private ScreenRouter router;

    public RegisterScreen(BufferedReader consoleReader, UserService userService, ScreenRouter router){
        super("RegisterScreen", "/register");
        this.consoleReader = consoleReader;
        this.userService = userService;
        this.router = router;
    }

    public void render() {
        String firstname;
        String lastname;
        String username;
        String password;
        String email;
        String phone_number;
        // The above are locally scoped and don't get initialized

        try{
            System.out.println("+******************************+");
            System.out.println("Register for a new profile");
            System.out.println("+******************************+");

            System.out.print("First name: ");
            firstname = consoleReader.readLine();

            System.out.print("Last name: ");
            lastname = consoleReader.readLine();

            System.out.print("User name: ");
            username = consoleReader.readLine();

            System.out.print("Password: ");
            password = consoleReader.readLine();

            System.out.print("Email: ");
            email = consoleReader.readLine();

            System.out.print("Phone number: ");
            phone_number = consoleReader.readLine();

            Customer newUser = new Customer(username, password, firstname,lastname, email, phone_number);
            //System.out.println("Customer constructor invoked!");
            userService.register(newUser);
            router.navigate("/login");


        } catch (InvalidRequestException | ResourcePersistenceException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
