package com.revature.muhammad_ibrahim_p0;

import com.revature.muhammad_ibrahim_p0.models.HumanUsers;

public class driver {

    public static void main(String[] args) {
        HumanUsers humanUsers = new HumanUsers("user1", "pass123", "email@.com",
                "Yasin", "Ibrahim","9194135482");

        System.out.printf("Welcome %s %s, your email is %s, and phone is %s",
                humanUsers.getFirst_name(),humanUsers.getLast_name(),humanUsers.getEmail(),
                humanUsers.getPhone_number());
        System.out.println("\n+*************************+");
        System.out.println(humanUsers);

    }
}
