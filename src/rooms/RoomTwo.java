package rooms;
import sounds.SwitchSound;
import actions.delay;
import actions.SwitchesLoop;
import pictureCall.Graphics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RoomTwo {
    public static void room2() {
        //variables and arrays
        String choices[] = {"Look around", "Switch 1", "Switch 2", "Switch 3", "yes", "no"};
        int choice = 2;
        Scanner input = new Scanner(System.in);
        //variables and arrays

        System.out.println("\nAs you crash through the floor, you stumble into a room, surrounded by tombs.\n");

        while (choice >= 2) {
            System.out.println("1." + choices[0]); // choices array [0] look around

            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("\nThe room is too dark, so you run your hand against the wall. Then, you find 3 switches, one of them may turn on the light.\n");
                switches();
            } else System.out.println("Choose again:");
        }
    }
    public static void switches() {
        String choices[] = {"Look around", "Switch 1", "Switch 2", "Switch 3", "Yes", "No"};
        int choice = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Interact with these switches?\n");
        System.out.println("1." + choices[4]);
        System.out.println("2." + choices[5]);
        choice = input.nextInt();


        if (choice == 1) {
            System.out.println("\nWhich one do you want to turn on?");
            System.out.println("1." + choices[1]); //switch 1
            System.out.println("2." + choices[2]); //switch 2
            System.out.println("3." + choices[3]); //switch 3
            choice = input.nextInt();
            if (choice == 1) {
                SwitchSound.soundswitch();
                Switch1();
            } else if (choice == 2) {
                SwitchSound.soundswitch();
                Switch2();
            } else if (choice == 3) {
                SwitchSound.soundswitch();
                Switch3();
            } else
                System.out.println("Choose again:");
        }

        if (choice == 2) {
            System.out.println("You refused to check the switches, but there is nothing else to do, so you ought to just do it.");
            SwitchesLoop.switchesloop();
        }
    }
    public static void Switch1(){
        int choice;
        Scanner input = new Scanner(System.in);
        String[] choices = {"Ignore it","Find the source"};
        delay.delayl();
            System.out.println("The light turns on.\nA few seconds later, you hear the sound of someone smiling coming from a tomb, but you can't tell which one.");
             System.out.println("1." + choices[0]);
             System.out.println("2." + choices[1]);
        choice = input.nextInt();
        if (choice == 1){
            ignore();
        }
        else if (choice == 2){
            findout();
        }
    }
    public static void Switch2() {
        int choice;
        Scanner input = new Scanner(System.in);
        delay.delayl();
    System.out.println("Your stomach feels weird after flipping the switch, like something is moving inside your stomach.");
    delay.delay2();
    Graphics.deathScreen();
    System.out.println("try again?\n 1. Yes\n2. No");
    choice = input.nextInt();
    if (choice == 1){
        switches();
    }
    else if (choice == 2){
        System.exit(0);
    }
    }
    public static void Switch3() {
        delay.delay5();
        System.out.println("nothing happened");
        switches();
    }
    public static void ignore(){
        String[] choices = {"Take it","Don't take it"};
        System.out.println("After the lights turn on, you can see many different tombs, most of them look old and crackly,\n"+
                "as if they have been here a few hundred years. You walj around the room, trip on a skull on the ground, and see paper within. Do you take it?");
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1." + choices[0]);
        System.out.println("2." + choices[1]);
        choice = input.nextInt();
        if (choice == 1){
            System.out.println("You reach your hand into the skull. A spider crawls out and bites you. your limbs turn black, and you collapse on the floor, never to awaken again.");
            delay.delay2();
            Graphics.deathScreen();
            System.out.println("try again ?\n 1. Yes\n2. No");
            choice = input.nextInt();

            if (choice == 1){
                ignore();
            }
            else  if (choice == 2){
                System.exit(0);
            }
        }
        else if (choice == 2 ){
            System.out.println("You refuse to take the paper because you feel that nothing good could come from it. You were right; a poisonous spider crawls out and almost bites you. Now, you\n" +
                    "take the paper because it appears to be safe now.");
            delay.delay2();
            System.out.println("\nThe paper says:\n" +
                    "\"More than 2,000 people died that day.\""+
                    "\nYou have no idea what that means, and, frankly, you don't care, so you jam it into your pocket for later.");
            room2Part2.roomTwoChestScene();
        }
    }
    public static void findout(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("You go to find out where the sound came from in each of the tombstones, but there was nothing.\n" +
                "Suddenly, something taps on your shoulder. You slowly turn around and...\n" +
                "The action is too quick to be perceived, and your life fades away.");
        delay.delay2();
        Graphics.deathScreen();
        System.out.println("Try again?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        choice = input.nextInt();
        if (choice == 1){
            switches();
        }
        else if ( choice == 2){
            System.exit(0);
        }
    }
}