package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private  Connection connection = null;


    public Util() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_project",
                "postgres",
                "almaz2002");
    }

    public Util(Connection connection) {

    }

    public Connection getConnection()    {
        return connection;
    }
}

