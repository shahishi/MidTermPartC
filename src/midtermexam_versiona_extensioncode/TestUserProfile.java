/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author shirishshahi
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying the list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");
        System.out.print("Enter the number corresponding to your favorite genre: ");

        // Reading the user's input for genre choice
        int genreChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Mapping the genre choice to the actual genre
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Comdey";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Mystery";
                break;
            default:
                genre = "Unknown";
                break;
        }

        // Reading the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Creating the user profile
        UserProfile userProfile = new UserProfile(name, genre);

        // Displaying the profile creation message
        System.out.println("Your user profile was created:");
        System.out.println(userProfile);
    }
}
