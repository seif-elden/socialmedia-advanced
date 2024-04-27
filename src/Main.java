import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        NetworkService n1 = new NetworkService();

        Scanner input = new Scanner(System.in); // Create a Scanner input

        boolean notloged = true;
        profile loggedUser = null;

        // handle login
        while (notloged){
            System.out.println("\nPress 1 to login 2 to signup");
            int option = input.nextInt();
            input.nextLine();
            if (option == 1){
                System.out.println("Enter username:");
                String username = input.nextLine();

                System.out.println("Enter password:");
                String password = input.nextLine();

                loggedUser = n1.loginUser(username , password );
                if (loggedUser != null) {
                    notloged=false;
                }else {
                    System.out.println("\nFailed to login");
                }
            }else if (option == 2){
                // Prompt for user details
                System.out.println("Enter username:");
                String username = input.nextLine();

                System.out.println("Enter password:");
                String password = input.nextLine();

                System.out.println("Enter bio:");
                String bio = input.nextLine();

                System.out.println("Enter profile picture URL:");
                String profilePicUrl = input.nextLine();

                n1.registerUser(username, password, bio, profilePicUrl);
            }
        }

        while(loggedUser != null){
            System.out.println("\nPress 1 to view your profile");
            System.out.println("\nPress 2 to view all users");
            System.out.println("\nPress 3 to view followed users ");
            System.out.println("\nPress 4 to follow users ");
            System.out.println("\nPress 5 to view posts ");
            System.out.println("\nPress 6 to select posts ");
            System.out.println("\nPress 4 to follow users ");
            System.out.println("\nPress 4 to follow users ");
            System.out.println("\nPress 5 to logout");


        }





    }
}
