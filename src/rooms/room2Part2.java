package rooms;
import actions.ChestScene;
import actions.delay;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class room2Part2 {
    public static void roomTwoChestScene(){
    int choice;
    Scanner input = new Scanner(System.in);
    System.out.println(" \nSuddenly, a creepy, bloody face appears. The head appears to be attached to no body, and you run in fear of what might come if you stay.\n"
            +"you run to the end of a pathway and hit a dead end. Fortunately, the disembodied head disappeared... \n");
    delay.delay10();
    System.out.print("You calm yourself and sit down, but you feel that you've rested upon something cold and solid.\n" +
            "You turn around to see what it is, and you see 5 small chests on the ground.\n");
    System.out.print("\n1.Inspect the chests.\n");

    choice = input.nextInt();
    switch (choice) {
        case 1:
                ChestScene.chestStuff();
            break;
    }
    while (choice !=1){
        System.out.println("You only have the one option, bud.\n");
        System.out.print("1.Inspect the chests.\n");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                ChestScene.chestStuff();
                break;
        }
    }
}
}

