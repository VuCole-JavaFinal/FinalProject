import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Attic {
    public static void Attic(){
        int choice;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        System.out.println("-----------------------");
        try {
            TimeUnit.SECONDS.sleep(3);
            // delay 0.5 second
//        TimeUnit.MICROSECONDS.sleep(10000);
            // delay 1 minute
            //TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("\n you wake up in a derelict attic, with a small round window and a door on the floor.");
        System.out.println("1.Interact with window \n2.Interact with door.");

        if (choice == 1){
            System.out.println("Window is very thick and difficult to see through, look elsewhere.");
            System.out.println("1.Interact with door");
            choice = input.nextInt();
                if (choice == 1){
                    AtticDoor.AtticDoor();
                }
            }
        else {
            AtticDoor.AtticDoor();
        }
    }
}
