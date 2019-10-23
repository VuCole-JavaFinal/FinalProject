package actions;

import rooms.RoomTwo;

import java.util.Scanner;

public class SwitchesLoop {
    public static void switchesloop(){
    String choices [] = {"look around","Switch 1","Switch 2","Switch 3","yes","no"};
    int choice = 2;
    Scanner input = new Scanner(System.in);
    //variables and arrays

        System.out.println("\nInteract with the switches?\n");
        System.out.println("1." + choices[4]);
        System.out.println("2." + choices[5]);

        while (choice == 2){ //this will loop until the user input is 1
            choice = input.nextInt();
            if (choice == 1){
        System.out.println("\nWhich one do you want to turn on?");
        RoomTwo.switches();
    }
        else if (choice == 2) {
            System.out.println("You refuse to check the switches, but there is nothing else to do, so there isn't much use in not checking them.");

        }
        else
            System.out.println("Choose again:");
        }
    }
}
