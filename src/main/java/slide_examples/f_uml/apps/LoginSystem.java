package slide_examples.f_uml.apps;

import slide_examples.f_uml.entities.User;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoginSystem {
    static void main(String[] args) {
        User u1 = new User("michelle", "password", "Michelle", "Graham");
        User u2 = new User("andrea", "another password", "Andrea", "O'Neill");
        User u3 = new User("alice_fox", "short");
        ArrayList<User> users = new ArrayList<>(Arrays.asList(u1, u2, u3));

        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;
        while(keepRunning) {
            // Offer user choice to stop attempting log in
            System.out.println("Do you want to log in? (Y/y for yes, any other key to exit)");
            String choice = input.nextLine();
            if(!choice.equalsIgnoreCase("y")){
                System.out.println("Program terminating...");
                keepRunning = false;
                continue;
            }

            // Take in log in details
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            // Attempt login - if a user exists with these credentials, log in and end process
            boolean loginSuccess = login(users, username, password);
            if (loginSuccess) {
                System.out.println("Login successful!");
                keepRunning = false;
            } else {
                System.out.println("Login failed. Please try again.");
            }
        }
    }

    public static boolean login( ArrayList<User> users, String username, String password){
        for (User user : users) {
            if(user.getUsername().equalsIgnoreCase(username)){
                if(user.checkPassword(password)){
                    return true;
                }
            }
        }

        return false;
    }
}
