import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chestScene {
    public static void chestStuff() {
        //        variables and arrays
        int choice = 0;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        int[] chestLabel = {23062, 11001, 92480, 18943, 11901};
        String[] questions = {"1.Interact with those chest", "2.Crying in a corner", "3.Kick on those chests"};
        System.out.print("\nthere are 5 chests, each of them labeled a number:\n");
        //----------------------------------------------

        for (int i = 0; i < chestLabel.length; i++) {
            {
                System.out.print("chest labeled " + chestLabel[i] + "\n");
            }
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.print(" \nWhat are you going to do ?\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

//        coundownTest.countdown();
        test1();
    }
    public static void test1(){
        int choice;
        String[] questions = {"1.Interact with those chest", "2.Crying in a corner", "3.Kick on those chests"};
        Scanner input = new Scanner(System.in);
        boolean invalid = true;
        System.out.print("\n");
        System.out.println(questions[0]);
        System.out.println(questions[1]);
        System.out.println(questions[2]);

        while (true) {
            choice = input.nextInt();
            if (choice >= 4) {
                invalid = false;
                System.out.print("choose again \n");
            }
            if (choice == 1) {
                interactChests();
                break;
            } else if (choice == 2) {
                CryingInACorner();
                break;
            } else if (choice == 3) {
                KickingChest();
                test1();
                break;
            }
        }
    }


    public static void interactChests(){
        int choice = 5;
        Scanner input = new Scanner(System.in);
        int[] chestLabel = {23062, 11001, 92480, 18943, 11901};
        System.out.print("\nwhich one do you want to open ? \n");
        System.out.print("please type the number of the chest\n");
        for (int a = 0; a < chestLabel.length; a++) {
            {
                System.out.print("Chest with label " + chestLabel[a] + "\n");
            }
        }
        while (choice != chestLabel[0]+chestLabel[1]+chestLabel[2]+chestLabel[3]+chestLabel[4]) {
            choice = input.nextInt();
            if (choice == chestLabel[0]) {
                Chest23062();
                break;
            } else if (choice == chestLabel[1]) {
                Chest11001();
                break;
            } else if (choice == chestLabel[2]) {
                Chest92480();
                break;
            } else if (choice == chestLabel[3]) {
                Chest18943();
                break;
            } else if (choice == chestLabel[4]) {
                Chest11901();
                break;
            }
            System.out.print("choose again and please choose a valid one \n");
        }
    }

    public static void CryingInACorner(){
        int choice2 =3;
        Scanner input = new Scanner(System.in);
        System.out.print("\n you were too afraid to move, you sit in a corner and cried to died");
        System.out.print("\n try again?");
        System.out.print("\n1.yes\n2.no\n");
        while(choice2 >= 3) {
            choice2 = input.nextInt();
            if (choice2 == 1) {
                test1();
            } else if (choice2 == 2) {
                System.exit(0);
            }
            else
                System.out.print("choose again \n");
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
        System.out.print("you kicked on those chest to see something would react. But nothing happened \n");
    }
    public static void Chest23062(){
        String choice =null;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened the chest with label 23062 \n");
        for (int i = 0 ; i <= 3; i ++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
        }
        System.out.print("Ricardo Milos killed you.\nYou died\nTry again ? \n");
        System.out.println("\nType yes, or no");
        while (choice != "yes"+"no") {
            choice = input.next();
            if (choice.equalsIgnoreCase("yes")) {
                interactChests();
                break;
            } else if (choice.equalsIgnoreCase("no")) {
                System.exit(0);
                break;
            }
            else
                System.out.print("choose again and please choose a valid one. \n");
        }
    }
    public static void Chest11001() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened the chest with label 11001 \n");
        datepaper.spookyPaper();
    }
    public static void Chest92480(){
        int choice = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened chest with label 92480\n");
        for (int i = 0 ; i <= 5 ; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
        }
        System.out.print("an unidentifiable thing jumped out and killed you\nYou died\nTry again ? \n");
        while (choice >= 2){
            System.out.print("\n1 for yes \n2 for no\n");
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
    public static void Chest18943(){
        int choice = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("you opened the chest label 18943 \n");
        for (int i = 0 ; i <= 3; i ++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
        }
        gotcha.circleGame();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        while (choice >= 3) {

            System.out.print("\n1 for yes \n2 for no\n");
            choice = input.nextInt();
            if (choice == 1) {
                interactChests();
            } else if (choice == 2) {
                System.exit(0);
            }
        }
    }
    public static void Chest11901(){
        System.out.print("you opened the chest with label 11901 \n");

        for (int i = 0 ; i <= 3; i ++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println(".");
        }
        System.out.print("you opened the right one. you a key in the chest. you used the key to open the door and move down to the next floor.\n");
        Room1.room1();
    }
}

