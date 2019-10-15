import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


// this Main class ask user play the game or not
public class Main {
    public static void main(String[] agrs) {
            System.out.println("1.Play \n2.Exit");
            // press 1 to play, press 2 to exit
            boolean invalid = true;
            while (invalid == true) {
                    int choice;
                    Scanner input = new Scanner(System.in);
                    choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("spawn in room 4, you get a key after completed a room and move on to the next one.\n" +
                                    "   in order to win the game, you have to have enough 4 keys.\n" +
                                    "                            Begin                           ");
//                            Attic.Attic();
                            break;
                            //this statement will call to class Attic when press 1.
                    }
                        else if (choice == 2) {
                            System.exit(0);
                            break;
                            //this statement will end program when press 2
                    }
                        else {
                            System.out.println("choose again. 1 or 2");
                            invalid = true;
                            //invalid input loop
                    }
            }
    }
}



