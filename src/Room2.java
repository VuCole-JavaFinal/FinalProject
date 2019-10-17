import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Room2 {
    public static void main(String args[]) {
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
                System.out.println("the room is too dark, you put your hand against the wall and follow. then, you found 3 switches, one of them may turns on the light.\n");
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
                Switch1();
            } else if (choice == 2) {
                Switch2();
            } else if (choice == 3) {
                Switch3();
            } else
                System.out.println("choose again");
        }
        //==================================

        if (choice == 2) {
            System.out.println("I refused to check those switches, but there is nothing else to do because you can't see, maybe I should check those");
            switchesLoop.switchesloop();
        }
    }
    public static void Switch1(){


    }
    public static void Switch2() {


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
}

