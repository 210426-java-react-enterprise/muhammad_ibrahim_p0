package com.revature.muhammad_ibrahim_p0.DAO;

import com.revature.muhammad_ibrahim_p0.models.Customer;
import com.revature.muhammad_ibrahim_p0.util.ConnectionFactory;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public void saveUserToDB(Customer newUser){

        try (Connection conn = ConnectionFactory.getInstance().getConnection()){
            String sqlInsertUser = "insert into project_0.customer (username, password, email, first_name, last_name, " +
                    "phone_number) values (?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sqlInsertUser, new String[]{"user_id"});
            pstmt.setString(1, newUser.getUsername());
            pstmt.setString(2, newUser.getPassword());
            pstmt.setString(3, newUser.getEmail());
            pstmt.setString(4, newUser.getFirst_name());
            pstmt.setString(5, newUser.getLast_name());
            pstmt.setString(6, newUser.getPhone_number());
            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted != 0 ){
                ResultSet rs = pstmt.getGeneratedKeys();
                while (rs.next()) {
                    newUser.setId(rs.getInt("user_id"));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isUsernameAvailable(String username) {

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            String sql = "select * from customer where username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);


            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
               return false;
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
        return true;
    }


    // checking to make sure email is unique and not persisted already during registration
    public boolean isEmailAvailable(String email) {

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            String sql = "select * from customer where email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);


            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return false;
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    // login method
    public Customer findUserByUsernameAndPassword(String username, String password) {
        Customer user = null;

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            String sql = "select * from customer where username = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new Customer();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirst_name(rs.getString("first_name"));
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
