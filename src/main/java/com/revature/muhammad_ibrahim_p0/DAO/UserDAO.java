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

}
