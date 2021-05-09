package com.revature.muhammad_ibrahim_p0.util;

import java.util.Properties;

public class ConnectionFactory {

    private static ConnectionFactory connectionFactory;
    private Properties properties = new Properties();

    static {
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

 /*   private ConnectionFactoey() {
        try {
            properties.load(new FileReader());
        }
    }
*/
}
