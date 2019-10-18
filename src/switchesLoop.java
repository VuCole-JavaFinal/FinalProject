import java.util.Scanner;

public class switchesLoop {
    public static void switchesloop(){
    String choices [] = {"look around","Switch 1","Switch 2","Switch 3","yes","no"};
    int choice = 2;
    Scanner input = new Scanner(System.in);
    //variables and arrays

        System.out.println("\nInteract with these switches ?\n");
        System.out.println("1." + choices[4]);
        System.out.println("2." + choices[5]);

        while (choice == 2){ //this will loop until the user input is 1
            choice = input.nextInt();
            if (choice == 1){
        System.out.println("\nwhich one do you want to turn on ?");
        Room2.switches();
    }
        else if (choice == 2) {
            System.out.println("I refused to check those switches, but there is nothing else to do because you can't see, maybe I should check those");

        }
        else
            System.out.println("choose again");
        }
    }
}
