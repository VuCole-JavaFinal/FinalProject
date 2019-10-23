package rooms;

import actions.delay;
import pictureCall.Graphics;
import pictureCall.PicsOfAnt;
import pictureCall.Fox;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RoomOne {
    public static void room1(){
        //initiates the player falling for a certain amount of time
        int randomFall;
        int minute = 0;
        Random rand = new Random();
        randomFall = rand.nextInt(10)+1;

        for (randomFall = 0; randomFall < 10; randomFall++) {
            randomFall = rand.nextInt(10) + 1;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.print(".\n");
            minute++;
        }

        System.out.println("It takes you " + minute + " minute(s) to drop down to here.");

        if (minute <= 4 ){
            System.out.print("That's pretty quick. \n\n");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            AntonioTheAnt();
        }

        else if (minute >= 5){
            System.out.print("It felt like forever.\n\n");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            AntonioTheAnt(); //after the fall end call next method
        }
    }

    public static void AntonioTheAnt(){

        System.out.println("\nThis room is the biggest room compared to the others, with a large door on the front. \n"+
                "Soon, you hear some strange noises behind your back.");

        //actions.delay the conversation

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

        //end actions.delay the conversation

        System.out.println("\nYou turn around to see what it is, and you are shocked when you see a massive ant sitting on the floor, leaned against the wall.");
        delay.delayforPic(); //show pics and actions.delay 7 for next dialogue
        PicsOfAnt.image1();

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.print("\nThe ant did not move, and it is making weird noises, as if it is hurt. It takes all of your courage and you take a closer look. You see it’s eyes are bleeding.\n\n");

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

        Dialog(); // after the conversation end, call next method
    }
    public static void Dialog(){

        //variables and array
        int choice;
        Scanner input = new Scanner(System.in);
        boolean question1 = false;
        boolean question2 = false;
        boolean question3 = false;
        String[] questions  = {"Who are you?","You can talk?","Are you ok?"};
        // end variables and array

        System.out.print("???: Hello ?\n");
        delay.delay3();
        System.out.print("\nThe prompt response scares you, and you run away in fear.\n\n");
        delay.delay3();

        // choose 3 question. after choosing all 3, call next method
        System.out.print("Note from creators: this part takes time to loop so we DIDN'T make loop for this part.\nplease choose carefully\n\n");
        System.out.print("1." + questions[0] +"\n");
        System.out.print("2." +questions[1] +"\n");
        System.out.print("3." +questions[2] +"\n");

        choice = input.nextInt();

        while (question1 || question2 || question3 != true){
            if (choice == 1){
                System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio.\n");
                question1 = true;
                System.out.print("1." + questions[1] +"\n");
                System.out.print("2." + questions[2] +"\n");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("???:yes\n");
                    question2 = true;
                    System.out.print("1." + questions[2] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("am I look like i'm ok ???\n");
                        question3 = true;
                        break;
                    }
                }
                else if (choice == 2) {
                    System.out.print("Do I look like I'm OK???\n");
                    question3 = true;
                    System.out.print("1." + questions[1] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???: Yes.\n");
                        question2 = true;
                        break;
                    }
                }
            }
            else if (choice == 2){
                System.out.print("???: Yes.\n\n");
                question2 = true;
                System.out.print("1." + questions[0] +"\n");
                System.out.print("2." + questions[2] +"\n");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("\n???: I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio.\n\n");
                    question1 = true;
                    System.out.print("1." + questions[2] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("???:Do I look like I'm OK???\n");
                        question3 = true;
                        break;
                    }
                }
                else if (choice == 2) {
                    System.out.print("???:Do I look like I'm OK???\n");
                    question3 = true;
                    System.out.print("\n1." + questions[0] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio.\n\n");
                        question1 = true;
                    }
                }
                break;
            }
            else if (choice == 3){
                System.out.print("Do I look like I'm OK??? \n\n");
                question3 = true;
                System.out.print("1." + questions[0] +"\n");
                System.out.print("2." + questions[1] +"\n");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio.\n\n");
                    question1 = true;
                    System.out.print("1." + questions[1] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???: Yes\n");
                        question2 = true;
                        break;
                    }
                }
                else if (choice == 2) {
                    System.out.print("\n\n???:Yes\n");
                    question2 = true;
                    System.out.print("\n1." + questions[0] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???: I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio.\n\n");
                        question1 = true;
                    }
                }
                break;
            }
        }
        if (question1 && question2 && question3){
            Dialogue2();
        }
        //end of choosing qustion
    }
    public static void Dialogue2(){
        int choice = 2 ;
        Scanner input = new Scanner(System.in);
        //add scanner and variables

        System.out.println("\n\nme: Why am I here?");
        delay.delay3();
        System.out.println("\nAntonio: This is an uninhabited house in the Saurine Forest.");
        delay.delay3();
        System.out.println("\nAntonio: Saurine Forest is a place where a lot of strange and unidentifiable accidents have happened, but nobody knows why..\n" +
                "Some unfortunate people disappeared or were kidnapped near Saurine Forest.");

        while ( choice >=2 ){ //loop invalid input
            System.out.println("\n1.How can I get out of this place?");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Me:How can I get out of this place?");
                Dialogue3();
                break;
            }
            System.out.println("\nChoose again:");
        }

    }
    public static void Dialogue3() {

        String[] helpOrNot = {"Help","Don't help"};
        int choice = 2;
        int choice2 = 2 ;
        Scanner input = new Scanner(System.in);
        // variables

        delay.delay3();
        System.out.println("\nAntonio: I believe that this may help you.");
        System.out.println("\n1.WHat is it?");

        while (choice >= 2) { // loop invalid input
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Me:what is it ?");
                delay.delay3();
                System.out.println("\nAntonio: Do you see a two-headed fox over there. He ate the key when he was too hungry, in order to get the key, you have to slaughter the fox."+
                        "\nI have an axe in my house. If you help me, i'll give you the key to my house and give you the axe.");
                delay.delay3();
                System.out.println("\n1."+ helpOrNot[0]);
                System.out.println("2."+ helpOrNot[1]);
                while ( choice2 >= 1) {// loop invalid input
                    choice2 = input.nextInt();
                    if (choice2 == 1) {
                        System.out.println("\nMe:Ok, sounds like a deal. What do you want?");
                        delay.delay3();
                        helpAntonio();
                        break;
                    } else if (choice2 == 2) {
                        System.out.println("\"Helping him maybe the only way out, lets try it.\" \n");
                    }
                    else
                        System.out.println("Choose again:");
                }
                break;
            }
            System.out.println("\nChoose again:");
        }

    }
    public static void helpAntonio() {
        int choice = 1;
        //variables

        Scanner input = new Scanner(System.in);

        delay.delay3();
        System.out.println("\nAntonio: There are some painkillers and bandages down in the basement, can you help me get them?");
        delay.delay3();
        System.out.println("\nMe: Sure.");
        delay.delay3();
        System.out.println("\nYou descend the stairs into the basement. It looks dark, old, and smelly, with spider webs hanging everywhere.  You see a small box, do you want to open it?");

        System.out.println("1.Open");
        while (choice >= 1) { //loop invalid input
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You open the box.");
                for (int i = 0; i <= 3; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                    System.out.println(".");
                }
                System.out.println("\nThere is nothing inside (enter a number to continue).");
                break;
            }
            else System.out.println("1.Open");
        }

        choice = input.nextInt();
        while (choice >= 1) {//loop invalid input
            System.out.println("\n1. Check more?");
            choice = input.nextInt();
            if (choice == 1) {
                theBox();
                break;
            }
        }

    }

    private static void theBox() {
        String[] choices = {"Check the top","Check under","Check side"};
        int choice;
        Scanner input = new Scanner(System.in);
        //variables

        //warning
        System.out.print("Note from creators: this part takes time to loop so we DIDN'T make loop for this part.\nplease choose carefully\n\n");
        //warning

        System.out.println("1." + choices[0]);
        System.out.println("2." + choices[1]);
        System.out.println("3." + choices[2]);

        choice = input.nextInt();

        if (choice == 1){ //choice 1 check top, after check top, it will keep asking until the user choose to check under the box
            System.out.println("You check on the top of the boxes.\n");
            delay.delay3();
            System.out.println(" the top of the box is rusty, like it has been here a really long time.\n");
            System.out.println("1." + choices[1]);
            System.out.println("2." + choices[2]);
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("you check under the box.");
                delay.delay3();
                System.out.println("There’s a hole under the box, do you dare check it?\n");
                System.out.println("1.Check");
                choice = input.nextInt();
                if ( choice == 1){
                    underTheBox();
                }
            }
            else if ( choice == 2 ) {
                System.out.println("The box is empty, and the sides are rustu.\n");
                System.out.println("1." + choices[1]);
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("There’s a hole under the box, would you like tocheck it?\n");
                    System.out.println("1.Check");
                    choice = input.nextInt();
                    if ( choice == 1){
                        underTheBox();
                    }
                }
            }
        }

        else if (choice == 2) {// choice 2 check under
            System.out.println("You check under the box.\n");
            delay.delay3();
            System.out.println("There’s a hole under the box, check it?\n");
            System.out.println("1.Check");
            choice = input.nextInt();
            if (choice == 1) {
                underTheBox();
                //end
            }
        }

        else if (choice == 3) {// choice 3 check side. it will keep asking until the user choose to check under the box
            System.out.println("You check the sides of the box.\n");
            delay.delay3();
            System.out.println("There is nothing besides some rust in the box\n");
            delay.delay3();
            System.out.println("1." + choices[0]);
            System.out.println("2." + choices[1]);
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("you check on the top of the box");
                delay.delay3();
                System.out.println("The top of the box is rusty, like it has been here really long time.\n");
                delay.delay3();
                System.out.println("1." + choices[1]);
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("You check under the box");
                    System.out.println("There’s a hole under the box, check it?\n");
                    System.out.println("1. Check");
                    choice = input.nextInt();
                    if (choice == 1) {
                        underTheBox();
                    }
                }
            } else if (choice == 2) {
                System.out.println("1." + choices[1]);
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("You check under the box");
                    System.out.println("There’s a hole under the box, check it?\n");
                    System.out.println("1.Check");
                    choice = input.nextInt();
                    if (choice == 1) {
                        underTheBox();
                    }
                }
            }
        }
    }

    private static void underTheBox() {
        int choice = 2;
        Scanner input = new Scanner(System.in);
        //scanner and variables

        System.out.println("\nYou found painkillers and bandages for Antonio.");
        System.out.println("\nGive them to Antonio?");

        while (choice >= 2) {
            System.out.println("\n1.yes");
            choice = input.nextInt();
        }

        if (choice == 1){
            System.out.println("\nMe: There you go.");
            PicsOfAnt.image2();
            delay.delayforPic();
            System.out.println("\nAntonio: Thank you, here is your key to my house");
            delay.delay3();
            finalScene();
        }

    }
    public static void finalScene(){
        //variables and array
        String[] choices = {"Slaughter the fox","Kill Antonio","Swing around"};
        System.out.println("\nNow you have the axe, what are you going to do ?\n");
        int choice;
        Scanner input = new Scanner(System.in);

        //choices
        System.out.println("\n1." + choices[0]); // kill fox
        System.out.println("2." + choices[1]); // kill Antonio
        System.out.println("3." + choices[2]); // swing around

        choice = input.nextInt();

        //loop until the user choose to slaughter the fox
        if (choice == 1){
            System.out.println("You decided to slaughter the fox.\n");
            Fox.image1();
            delay.delayforPic();
            Fox.image2();
            delay.delayforPic();
            System.out.println(" you remove the key from inside the fox, open the door and run out.");
            delay.delay3();
            System.out.println("\n congratulation, you WON!!!");
            Graphics.winScreen();
        }

        if (choice == 2){
            System.out.println("The toxic from Antonio's corpse spread out. You feel terrible, and you fall over on the ground.");
            delay.delay2();
            Graphics.deathScreen();
            System.out.println("Try again?");
            System.out.println("1.Yes\n2.No");
            choice = input.nextInt();
            if (choice == 1){
                finalScene();
            }
            else if (choice == 2){
                System.exit(0);
            }
        }

        if (choice == 3){
            System.out.println("\nYou decide to swing the axe around");
            delay.delay3();
            System.out.println("\nAntonio looks at you like you are weird, mainly because you are.");
            finalScene();
        }
    }
}
