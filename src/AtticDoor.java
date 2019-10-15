import java.util.Scanner;

public class AtticDoor {
    public static void AtticDoor(){
        System.out.println("Door is stuck shut  as if it had been glued shut.\n There must be some way you could open it, maybe try looking around a bit.\n");
        System.out.println("1.Look Around \n");

        boolean invalid = true;
        while (invalid ==true) {
            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You see some cardboard boxes in the corner, and you notice the heavily stained mattress you woke up on. \n");
                break;
            } else {
                System.out.println("choose again \n");
                invalid = true;
            }
        }
    }
}

