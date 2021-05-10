package com.revature.muhammad_ibrahim_p0.DAO;

import com.revature.muhammad_ibrahim_p0.models.HumanUsers;
import com.revature.muhammad_ibrahim_p0.util.ConnectionFactory;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    
    public void saveUserToDB(HumanUsers newUser){

    }

    // login method
    public HumanUsers findUserByUsernameAndPassword(String username, String password) {
        HumanUsers user = null;

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            String sql = "select * from users where username = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new HumanUsers();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirst_name(rs.getString("firstname"));
                user.setLast_name(rs.getString("last_name"));
                user.setEmail(rs.getString("email"));
                user.setPhone_number(rs.getString("phone_number"));

            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    /*public HumanUsers findUserByUsernameAndPassword(String username, String password){
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

    }*/
}
