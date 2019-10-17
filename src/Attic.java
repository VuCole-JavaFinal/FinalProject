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
        //delay dialog
        System.out.println("\n you wake up in a derelict attic, with a small round window and a door on the floor.\n");
        System.out.println("\n\"1.Interact with window \n2.Interact with door.");

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
        int choice = 3;
        System.out.println("Door is stuck shut as if it had been glued shut.\nThere must be some way you could open it, maybe try looking around a bit.\n");
            System.out.println("1.Look Around \n");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You see some cardboard boxes in the corner, and you notice the heavily stained mattress you woke up on. \n");
                System.out.println("1.Interact with boxes \n2.Interact with mattress"); // choose 1 will interact boxes or 2 interact mattress
                choice = input.nextInt();
                if (choice == 1) {
                    boxesInteract();
            }
            }  if (choice == 2) {
                System.out.println("There's nothing special about the mattress, other than its horrible smell\n");
                System.out.println("1.Interact with boxes");
                choice = input.nextInt();
                if (choice == 1) {
                    boxesInteract(); //box interact after pressing 1
                } else
                    System.out.println("choose again");
            }
    }
    public static void boxesInteract(){
        String choices [] = {"1.Interact with mattress","2.Interact with door"};
        int choice = 2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("\n In the boxes you find nothing interesting, besides a small toolkit, with a small screwdriver in it. That should suffice");
        System.out.println("\n 1.Grab the screwdriver");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You grab the screwdriver, and you head towards the door. You COULD also go check to see if anything is in the mattress.");
                System.out.println(choices[0]);
                System.out.println(choices[1]);
                choice = input.nextInt();

                if (choice == 1) {
                    interactMattress();
                    choice = input.nextInt();
                    if (choice == 1){
                        interactDoor();
                    }
                }
                if (choice == 2) {
                    interactDoor();
                }
            }
            else
                System.out.println("choose again and please choose the right number");
        }
    public static void interactMattress(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("you stab open the mattress, and you find a bunch of old, stained stuffing.\n Gross!.");

        System.out.println(" \n1.interact with door"); //door interact after pressing 1
        choice = input.nextInt();
        if ( choice == 1){
            interactDoor();
        }

    }
    public static void interactDoor(){
        System.out.println("you slowly begin to stab at the glue, but half way through you hear the sound of footsteps upon creaky hardwood.\nYou are not alone.");
        //delay
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        //delay
        FootStepSoundAttic.sound2();
        //play sound
        System.out.println("\nYou stop picking at the glue for a second, and the footsteps begin to fade. You finish the job, and the attic door creaks open.");
    }
}

