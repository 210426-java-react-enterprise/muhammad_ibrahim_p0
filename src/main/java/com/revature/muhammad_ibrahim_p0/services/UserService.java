package com.revature.muhammad_ibrahim_p0.services;

import com.revature.muhammad_ibrahim_p0.DAO.UserDAO;
import com.revature.muhammad_ibrahim_p0.exceptions.InvalidRequestException;
import com.revature.muhammad_ibrahim_p0.exceptions.ResourcePersistenceException;
import com.revature.muhammad_ibrahim_p0.models.Customer;

public class UserService {

    private UserDAO userDAO;
    public UserService(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    public void register(Customer newUser) throws InvalidRequestException, ResourcePersistenceException{

        if (!isUserValid(newUser)) {
            throw new InvalidRequestException("Invalid new user data provided!");
        }
        if (!userDAO.isUsernameAvailable(newUser.getUsername()))
        {
            throw new ResourcePersistenceException("The provided username is already taken!");
        }
        if (!userDAO.isEmailAvailable(newUser.getEmail()))
        {
            throw new ResourcePersistenceException("The provided email is already taken!");
        }
        userDAO.saveUserToDB(newUser);
    }

    public boolean isUserValid(Customer user) {
        if (user == null) return false;
        if(user.getUsername() == null || user.getUsername().trim().isEmpty()|| user.getUsername().length() > 25) return false;
        if(user.getEmail() == null || user.getEmail().trim().isEmpty()|| user.getEmail().length() > 50) return false;
        if(user.getPassword() == null || user.getPassword().trim().isEmpty()|| user.getPassword().length() > 50) return false;
        if(user.getFirst_name() == null || user.getFirst_name().trim().isEmpty()) return false;
        if(user.getLast_name() == null || user.getLast_name().trim().isEmpty()) return false;
        if(user.getPhone_number() == null || user.getPhone_number().trim().isEmpty()|| user.getUsername().length() > 16) return false;


        return true;
    }
}
