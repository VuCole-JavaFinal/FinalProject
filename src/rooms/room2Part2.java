package rooms;
import actions.ChestScene;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class room2Part2 {
    public static void roomTwoChestScene(){
    int choice;
    Scanner input = new Scanner(System.in);
    System.out.println(" \n\n Suddenly, a creepy, bloody face appears; without a body and chase you, you ran in fear, scare and afraid of death. \n" +"you ran to the end of the way and there is no other way to go. but that thing disappeared... \n");
    try {
        TimeUnit.SECONDS.sleep(10);
        // actions.delay 0.5 second
//        TimeUnit.MICROSECONDS.sleep(10000);
        // actions.delay 1 minute
        //TimeUnit.MINUTES.sleep(1);
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
    System.out.print(" You calm your self and sit down, but you feel that something hard behind your back, you turned around to see what it is, and you saw 5 small chests on the ground\n");
    System.out.print("\n1.take a look at those chests\n");

    choice = input.nextInt();
    switch (choice) {
        case 1:
                ChestScene.chestStuff();
            break;
    }
    while (choice !=1){
        System.out.print("1.take a look at those chests\n");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                ChestScene.chestStuff();
                break;
        }
    }
}
}

