import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Attic {
    public static void Attic(){
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------");
        //delay the dialog
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println("\n you wake up in a derelict attic, with a small round window and a door on the floor.");
        System.out.println("1.Interact with window \n2.Interact with door.");

        choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Window is very thick and difficult to see through, look elsewhere.\n");
                System.out.println("1.Interact with door");
                AtticDoor();
        }
            if (choice == 2) {
                AtticDoor();
        }
            while(choice >= 3) {
                System.out.println("choose again");

                choice = input.nextInt();

                    if (choice == 1) {
                        AtticDoor();
                }
                    else if (choice == 2) {
                         AtticDoor();
                }
            }
    }
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
        System.out.println("1.Interact with boxes \n 2. Interact with");
    }
}

