package com.revature.muhammad_ibrahim_p0.DAO;

import com.revature.muhammad_ibrahim_p0.models.HumanUsers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserDAO {

    // below saves to file fir
    public void saveUserToFile(HumanUsers newUser){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/resources.users.txt", true))){
            writer.write(newUser.toFileString() + "\n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

 /*   public findUserByUsernameAndPassword(String username, String password){
        return null;

    }*/
}
