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
            System.out.println("\nPress 3 to follow users ");
            System.out.println("\nPress 4 to view followed users ");
            System.out.println("\nPress 5 to post ");
            System.out.println("\nPress 6 to view account posts ");
            System.out.println("\nPress 7 to logout");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println(loggedUser.toString());
                    break;
                case 2:
                    n1.showallprofiles();
                    break;
                case 3:
                    System.out.println("Enter username you want to follow");
                    loggedUser.addFriend(n1.getfriend(input.nextLine()));
                    break;
                case 4:
                    for (profile x : loggedUser.getFollowlist()){
                        System.out.println(x.getUsername());
                    }
                    break;
                case 5:
                    System.out.println("Enter post content");
                    loggedUser.addpost(input.nextLine());
                    break;
                case 6:
                    System.out.println("Enter username you want to see posts for");
                    for (Post x :  n1.getfriend(input.nextLine()).getPostlist()){
                        System.out.println(x.toString());
                        System.out.println("Enter 1 to comment 2 to toggle like 3 to show next post");
                        input.nextInt();
                        switch (input.nextInt()){
                            case 1:
                                System.out.println("Enter comment content");
                                input.nextLine();
                                x.addComment(loggedUser , input.nextLine() );
                                break;
                            case 2:
                                x.toggleLike(loggedUser);
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("You have successfully logged out.");
                    loggedUser = null;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }


        }





    }
}
