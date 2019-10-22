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
        String choices[] = {"look around", "Switch 1", "Switch 2", "Switch 3", "yes", "no"};
        int choice = 2;
        Scanner input = new Scanner(System.in);
        //variables and arrays

        System.out.println("\nyou went from floor 3 to here. in a dark room and surrounded by the tombs \n");

        while (choice >= 2) {
            System.out.println("1." + choices[0]); // choices array [0] look around

            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("\nthe room is too dark, you put your hand against the wall and follow. then, you found 3 switches, one of them may turns on the light.\n");
                switches();
            } else System.out.println("choose again");
        }
    }
    public static void switches() {
        String choices[] = {"look around", "Switch 1", "Switch 2", "Switch 3", "yes", "no"};
        int choice = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("\nInteract with these switches ?\n");
        System.out.println("1." + choices[4]);
        System.out.println("2." + choices[5]);
        choice = input.nextInt();


        if (choice == 1) {
            System.out.println("\nwhich one do you want to turn on ?");
            System.out.println("1." + choices[1]); //switch 1
            System.out.println("2." + choices[2]); //switch 2
            System.out.println("3." + choices[3]); // switch 3
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
                System.out.println("choose again");
        }

        if (choice == 2) {
            System.out.println("\"I refused to check those switches, but there is nothing else to do because you can't see, maybe I should check those\"");
            SwitchesLoop.switchesloop();
        }
    }
    public static void Switch1(){
        int choice;
        Scanner input = new Scanner(System.in);
        String[] choices = {"ignore it","find out what it is"};
        delay.delayl();
            System.out.println("the light turns on. \nA seconds later, you hear a creepy smile, comes from a tomb, but you don't know which one");
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
    System.out.println("your stomach feels weird after pressing the switch, like something is moving inside your stomach... you died");
    Graphics.deathScreen();
    System.out.println("try again ?");
    choice = input.nextInt();
    if (choice == 1){
        switches();
    }
    else if (choice == 2){
        System.exit(0);
    }
    }
    public static void Switch3() {
        for (int i = 0 ; i < 5 ; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
        }
        System.out.println("nothing happened");
        switches();
    }
    public static void ignore(){
        String[] choices = {"take","no"};
        System.out.println("after the light on.you see there are a lot of tombs, most of them look old, crackly."+
                "  Like they have been here a few hundred years...go  around the room, tripped on a skull on the ground, see paper, take it ?");
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1." + choices[0]);
        System.out.println("2." + choices[1]);
        choice = input.nextInt();
        if (choice == 1){
            System.out.println("you reach your hand into the skull. a spider appear and bit you. your limbs turn black. you turn into a spider");
                Graphics.deathScreen();
                System.out.println("try again ?");

            choice = input.nextInt();
            if (choice == 1){
                ignore();
            }
            else  if (choice == 2){
                System.exit(0);
            }
        }
        else if (choice == 2 ){
            System.out.println("you refused to take the paper because you feel that something is gonna happen. you were right, a poisonous spider just crawl out and almost bit you. you took the paper because it safe");
            delay.delay2();
            System.out.println("\nthe paper said:\n" +
                    "\"more than 2,000 and below 3,000 person died in that day.\""+
                    "\nyou have no idea what that mean, so you keep it in the pocket");
            room2Part2.roomTwoChestScene();
        }
    }
    public static void findout(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("you find out where the sound came from in every tombs, but there was nothing, suddenly, something taped on your shoulder, you turn around and...(whatever that happen) you died. ");
        Graphics.deathScreen();
        System.out.println("try again ? ");
        System.out.println("1.yes");
        System.out.println("2.no");
        choice = input.nextInt();
        if (choice == 1){
            switches();
        }
        else if ( choice == 2){
            System.exit(0);
        }
    }
}

