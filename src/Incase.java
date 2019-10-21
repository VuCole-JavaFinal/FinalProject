import java.util.Scanner;

public class Incase {
    // this class is about choosing the room you want to play again. Just in case if the program accidentally end.

    public static void incase(){
        //variables
        int choice;
        Scanner input = new Scanner(System.in);
        String[] choices = {"go back to the Attic","go back to room 3","go back to room 2","go back to room 1"};
        //variables

        System.out.println("1." + choices[0]); // attic
        System.out.println("2." + choices[1]); // room 3
        System.out.println("3." + choices[2]); // room 2
        System.out.println("4." + choices[3]); // room 1

        choice = input.nextInt();
        if (choice == 1 ){
            System.out.println("\n\nBEGIN\n\n");
            Attic.Attic();
        }
        if (choice == 2){
            System.out.println("\n\nBEGIN\n\n");
            RoomThree();
        }
        if (choice == 3){
            System.out.println("\n\nBEGIN\n\n");
            Room2.room2();
        }
        if (choice == 4){
            System.out.println("\n\nBEGIN\n\n");
            Room1.room1();
        }
        else
            incase();
    }
}

