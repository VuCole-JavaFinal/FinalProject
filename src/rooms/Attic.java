package rooms;

import actions.delay;
import actions.Short;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import sounds.FootStepSoundAttic;

public class Attic {
    public static void Attic(){
        int choice = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0;i< 70; ++i){
            System.out.print("-");
        }
         delay.delay2();
        //actions.delay dialog
        System.out.println("\n you wake up in a derelict attic, with a small round window and a door on the floor.\n");
        System.out.println("\n1.Interact with the window.\n2.Interact with the door.");
        choice = input.nextInt();

            while(choice != 3) {
                if (choice == 1) {
                System.out.println("The window is very thick and difficult to see through, so you decide to look elsewhere.\n");
                System.out.println("1.Interact with door");
                choice = input.nextInt();
                if(choice == 1)
                    AtticDoor();
            }
                else if (choice == 2){
                    AtticDoor();
                    break;
                }
                else if(choice != 1 || choice != 2) {
                AtticDoor();
                break;
            }
                System.out.println("Choose again:");
            }
    }
    public static void AtticDoor(){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("The door is stuck as if it had been glued shut.\nThere must be some way you could open it, maybe try looking around a bit.\n");
            System.out.println("1.Look Around \n");
            choice = input.nextInt();
            while(choice != 3) {
                System.out.println("You see some cardboard boxes in the corner, and you notice the heavily stained mattress you woke up on. \n");
                System.out.println("1.Interact with boxes \n2.Interact with mattress"); // choose 1 to interact boxes or 2 to interact with the mattress
                choice = input.nextInt();
                if(choice == 1) {
                    boxesInteract();
                    break;
                }
                else if(choice == 2){
                    Short.pl("There's nothing special about the mattress, other than the horrible smell. You better go check the boxes.\n");
                    System.out.println("1.Interact with boxes");
                    choice = input.nextInt();
                    if (choice == 1){
                        boxesInteract();
                        break;
                    }
                    while (choice != 1)
                        System.out.println("choose again");
                }
            }
    }
    public static void boxesInteract(){
        String choices [] = {"1.Interact with mattress","2.Interact with door"};
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\nIn the boxes you find nothing interesting, besides a small toolkit, with a small screwdriver in it. That should suffice.");
        System.out.println("\n1.Grab the screwdriver.");
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
                System.out.println("choose again and, please, choose the right number.");
        }
    public static void interactMattress(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("you stab open the mattress, and you find a bunch of old, stained stuffing.\nGross.");

        System.out.println(" \n1.interact with door"); //door interact after pressing 1
        choice = input.nextInt();
        if ( choice == 1){
            interactDoor();
        }

    }
    //Interact with the door after getting the screwdriver.
    //The gateway from the attic to room 3.
    public static void interactDoor(){
        System.out.println("you slowly begin to stab at the glue, but half way through you hear the sound of footsteps upon creaky hardwood.\nYou are not alone.");
        //actions.delay
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        //actions.delay
        FootStepSoundAttic.sound2();
        //play sound
        System.out.println("\nYou stop picking at the glue for a second, and the footsteps begin to fade. You finish the job, and the attic door creaks open.\n");
        //after interacting with the door the user move into room 3
        RoomThree.roomThree();

    }
}

