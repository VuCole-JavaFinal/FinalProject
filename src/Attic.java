import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Attic {
    public static void Attic(){
        int choice =3;
        Scanner input = new Scanner(System.in);
        for (int i = 0;i< 70; ++i){
            System.out.print("-");
        }
        //delay the dialog
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println("\n you wake up in a derelict attic, with a small round window and a door on the floor.\n");
        System.out.println("\n\"1.Interact with window \n2.Interact with door.");

//        choice = input.nextInt();
            while(choice >= 3) {
                choice = input.nextInt();

                if (choice == 1) {
                System.out.println("\nWindow is very thick and difficult to see through, look elsewhere.\n");
                System.out.println("\n1.Interact with door");
                choice = input.nextInt();
            }
                if (choice == 1){
                    AtticDoor();
                    break;
                }
            if (choice == 2) {
                AtticDoor();
                break;
            }
                System.out.println("choose again");
            }
    }
    public static void AtticDoor(){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Door is stuck shut as if it had been glued shut.\nThere must be some way you could open it, maybe try looking around a bit.\n");
        System.out.println("1.Look Around \n");
        choice = input.nextInt();
        while (choice >= 1) {
            if (choice == 1) {
                System.out.println("You see some cardboard boxes in the corner, and you notice the heavily stained mattress you woke up on. \n");
                System.out.println("1.Interact with boxes \n2.Interact with mattress");
            }
            choice = input.nextInt();
            if (choice == 1) {
                boxesInteract();
                break;
            } else if (choice == 2) {
                System.out.println("There's nothing special about the mattress, other than its horrible smell\n");
                System.out.println("1.Interact with boxes");
                choice = input.nextInt();
                if (choice == 1) {
                    boxesInteract();
                    break;
                }
            }
            System.out.println("choose again");
        }
                 }
    public static void boxesInteract(){
        String choices [] = {"1.Interact with mattress","2.Interact with door"};
        int choice = 2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("\n In the boxes you find nothing interesting, besides a small toolkit, with a small screwdriver in it. That should suffice");
        System.out.println("\n 1.Grab the screwdriver");
        while (choice >= 2 ) {
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You grab the screwdriver, and you head towards the door. You COULD also go check to see if anything is in the mattress.");
                break;
            }
            else
                System.out.println("choose again and please choose the right number");
        }
        System.out.println(choices[0]);
        System.out.println(choices[1]);
        choice = input.nextInt();
    }
}

