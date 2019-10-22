package rooms;

import rooms.Attic;

import java.util.Scanner;
import actions.Incase;

// this rooms.Main class ask user play the game or not
public class Main {
    public static void main(String[] agrs) {
        System.out.println("1.Play \n2.Exit\n3.Play the room you want");
        // press 1 to play, press 2 to exit, and enter 3 to pick from the 4 rooms
        boolean invalid = true;
        while (invalid == true) {
            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("spawn in room 4, you get a key after completed a room and move on to the next one.\n" +
                        "   in order to win the game, you have to have a key to the entrance door.\n");

                System.out.println("                           BIG WARNNING !!!");
                System.out.println("-Please choose a valid choice. most of the choices are entered by pressing a number." +
                        " If you type a word, the program will end immediately and you have to play all over again.");
                System.out.println("\n\n                            BEGIN                                   ");
                Attic.Attic();
                break;
                //this statement will call to class rooms.Attic when press 1.
            } else if (choice == 2) {
                System.exit(0);
                break;
                //this statement will end program when press 2
            }

            if (choice == 3) {
                Incase.incase();
            } else {
                System.out.println("choose again. 1, 2, or 3");
                invalid = true;
                //invalid input loop
            }
        }
    }
}



