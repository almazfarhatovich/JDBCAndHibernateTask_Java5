package peaksoft;

import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//        Util util = new Util();
//        System.out.println(util.getConnection());

        UserService userService = new UserServiceImpl();

//        userService.saveUser("Almaz","Janybekov", (byte) 20);
//        userService.saveUser("Dilbara","Asanalieva", (byte) 19);
//        userService.saveUser("Kanat","Ulukbekov", (byte) 23);
//        userService.saveUser("Ulan","Kubanychbekov", (byte) 26);
        // userService.removeUserById(1);
        //  userService.createUsersTable();
        // System.out.println(userService.getAllUsers());
        //userService.dropUsersTable();
        // userService.cleanUsersTable();
       System.out.println(userService.existsByFirstName("Ulakkn"));
    }
}
