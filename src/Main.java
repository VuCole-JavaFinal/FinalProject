import rooms.Attic;

import java.util.Scanner;
import actions.Incase;
import actions.Short;

// The beginning class, prompts the user to play or not
public class Main {
    public static void main(String[] args) {
        System.out.println("1.Play \n2.Exit\n3.Play the room you want");
        // press 1 to play, press 2 to exit, and enter 3 to pick from the 4 rooms
        boolean invalid = true;
        while (invalid) {
            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if (choice == 1) {
                Short.pl("You wake up inside a seemingly abandoned house. You have to progress through the various floors and earn keys.\n" +
                        "   In order to win the game, you have to have all keys to the entrance door.\n");

                Short.pl("                                  WARNING                                           ");
                Short.pl("-Please choose valid choices. Some of the choices are entered by pressing a number.\n" +
                        " If you type a word, the program will end immediately and you have to play all over again.");
                Short.pl("\n\n                            BEGIN                                   ");
                Attic.Attic();
                break;
                //this statement will call to class rooms.Attic when press 1.
            } else if (choice == 2) {
                System.exit(0);
                break;
                //this statement will end the program when two is pressed.
            }
            else if (choice == 3) {
                Incase.incase();
                break;
            } else {
                System.out.println("choose again. 1, 2, or 3");
                //invalid input loop
            }
        }
    }
}



