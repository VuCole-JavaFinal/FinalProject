package actions;

import pictureCall.Graphics;
import sounds.Kick;
import rooms.RoomOne;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChestScene {
    //move to this class after the user choose to interact with the chest
    public static void chestStuff() {
        //        variables and arrays
        int[] chestLabel = {23062, 11001, 92480, 18943, 11901};
        System.out.print("\nThere are 5 chests, each of them labeled with different numbers:\n");

        for (int i = 0; i < chestLabel.length; i++) {
            {
                System.out.print(chestLabel[i] + "\n");
            }
        }
        delay.delay5();
        System.out.print(" \nWhat do you decide to do?\n");
        delay.delay4();
        test1();
    }
    public static void test1(){
        int choice;
        String[] questions = {"1.Interact with the chests", "2.Cry in a corner", "3.Kick the chests"};
        Scanner input = new Scanner(System.in);
        boolean invalid = true;
        System.out.print("\n");
        System.out.println(questions[0]);
        System.out.println(questions[1]);
        System.out.println(questions[2]);

        while (invalid) {
            choice = input.nextInt();
            if (choice >= 4) {
                invalid = false;
                System.out.print("Choose again:\n");
            }
            if (choice == 1) {
                interactChests();
                break;
            } else if (choice == 2) {
                CryInCorner();
                break;
            } else if (choice == 3) {
                KickingChest();
                test1();
                break;
            }
        }
    }


    public static void interactChests(){ // open chest
        int choice = 12;
        Scanner input = new Scanner(System.in);
        int[] chestLabel = {23062, 11001, 92480, 18943, 11901};
        System.out.print("\nWhich one do you want to open? \n");
        System.out.print("Type the number of the chest you want to open.\n");
        for (int a = 0; a < chestLabel.length; a++) {
            {
                System.out.print("Chest with label " + chestLabel[a] + "\n");
            }
        }
        choice = input.nextInt();
        if (choice == chestLabel[0]|| choice == chestLabel[1]||choice == chestLabel[2]|| choice == chestLabel[3]|| choice == chestLabel[4]) {
            if (choice == chestLabel[0])
                Chest23062();
            else if (choice == chestLabel[1])
                Chest11001();
            else if (choice == chestLabel[2])
                Chest92480();
            else if (choice == chestLabel[3])
                Chest18943();
            else if (choice == chestLabel[4])
                Chest11901();
            }
    }
    public static void CryInCorner(){
        int choice2 =3;
        Scanner input = new Scanner(System.in);
        System.out.print("\nYou were too afraid to move, so you sit in a corner and cry until you can't anymore. You wallow in your puddle of tears until your body gives way.");
        Graphics.deathScreen();
        System.out.print("\nTry again?");
        System.out.print("\n1.Yes\n2.No\n");
        while(choice2 >= 3) {
            choice2 = input.nextInt();
            if (choice2 == 1) {
                test1();
            } else if (choice2 == 2) {
                System.exit(0);
            }
            else
                System.out.print("Choose Again \n");
        }
    }

    public static void KickingChest(){
        for (int i = 0; i <= 4; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.print(" kick! \n");
            Kick.sound2();
        }
        System.out.print("you kicked on the chests to see if something would react, but nothing happened.\n");
    }

    public static void Chest23062(){
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened the chest with the label 23062. \n");
        delay.delay5();
        System.out.print("Ricardo Milos springs out, killing you instantly.\n");
        delay.delay2();
        Graphics.deathScreen();
        System.out.println("Try again?\n");
        System.out.println("\n1.Yes\n2.No");
        while (choice != 1 || choice != 2) {
            choice = input.nextInt();
            if (choice == 1) {
                interactChests();
                break;
            } else if (choice == 2) {
                System.exit(0);
                break;
            }
            else
                System.out.print("Choose again and please choose a valid option.\n");
        }
    }

    public static void Chest11001() { //this chest wrong
        System.out.print("you opened the chest with the label 11001.\n");
        datepaper.spookyPaper();
    }
    public static void Chest92480(){    //this chest wrong
        int choice = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened the chest with the label 92480.\n");
        delay.delay5();
        System.out.print("An unidentifiable creature jumps out and mauls you.\n");
        delay.delay2();
        Graphics.deathScreen();
        System.out.println("Try again?");
        while (choice >= 3){
            System.out.print("\n1.Yes\n2.No\n");
            choice = input.nextInt();
            if (choice == 1){
                interactChests();
                break;
            }
            else if (choice == 2) {
                System.exit(0);
                break;
            }
            System.out.print("choose again");
        }
    }
    public static void Chest18943(){ // this chest wrong
        int choice = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened the chest with the label 18943. \n");
        delay.delay3();
        gotcha.circleGame();
        delay.delay4();
        while (choice >= 3) {
            System.out.print("\n1.Yes \n2.No\n");
            choice = input.nextInt();
            if (choice == 1) {
                interactChests();
            } else if (choice == 2) {
                System.exit(0);
            }
        }
    }
    public static void Chest11901(){ // this chest is right
        System.out.print("you opened the chest with label 11901 \n");
        delay.delayl();
        System.out.print("The chest holds another key, so it appears that you've opened the correct one. You move on into the next room.\n");
        RoomOne.room1();
    }
}

