package service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Zephyr on 12/3/2014.
 */
public class Database {
    private Connection dbConnection;

    public Database() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost/ann";
        String user = "root";
        String pass = "";
        dbConnection = DriverManager.getConnection(url, user, pass);
    }

    public Connection getDbConnection(){
        return dbConnection;
    }
}
