package com.revature.muhammad_ibrahim_p0.DAO;

import com.revature.muhammad_ibrahim_p0.models.HumanUsers;

import java.io.*;

public class UserDAO {

    String userDataFile;

    public UserDAO() { userDataFile = "resource/users.txt";}

    // below saves to file fir
    public void saveUserToFile(HumanUsers newUser){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(userDataFile, true))){
            writer.write(newUser.toFileString() + "\n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public HumanUsers findUserByUsernameAndPassword(String username, String password){
        try(BufferedReader reader = new BufferedReader(new FileReader(userDataFile))){
            String savedRecord;
            while((savedRecord = reader.readLine()) != null){
                String[] userData = savedRecord.split(";");
                if (userData[0].equals(username) && userData[1].equals(password)){
                    return new HumanUsers(userData[0],userData[1],userData[2],userData[3],userData[4],userData[5] );
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;

    }
}
