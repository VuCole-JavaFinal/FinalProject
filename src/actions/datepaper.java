package actions;

import actions.ChestScene;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class datepaper { // this class execute after choosing chest 11001
    public static void spookyPaper() {
        int choice =3;
        Scanner input = new Scanner(System.in);
        for (int a = 0; a <= 3; a++) {

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.print(". \n");

        }

        System.out.print("\nNothing is inside besides a piece of paper\n");
        System.out.print("\nShould you read the paper?\n");
        while (choice >=3) {
            System.out.print("1.Yes\n2.No\n");
            choice = input.nextInt();
            if (choice == 1) {
                Date date = new Date();
                System.out.print("You look at the paper to see what it says.\n");
                for (int i = 0; i <= 3; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                    System.out.println(".");
                }
                System.out.println("the paper said: today is " + new java.util.Date());
                System.out.println("Happy Halloween");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
                System.out.println("After reading the paper, you move on.");
                ChestScene.interactChests();
                break;
            } else if (choice == 2) {
                System.out.print("You throw the paper back in the chest and keep doing your work.\n");
                ChestScene.interactChests();
                break;
            }
        }
    }
}
