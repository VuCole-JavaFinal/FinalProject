import java.util.Scanner;

public class Room2 {
    public static void main(String args[]){
        //variables and arrays
        String choices [] = {"look around","Switch 1","Switch 2","Switch 3","yes","no"};
        int choice = 2;
        Scanner input = new Scanner(System.in);
        //variables and arrays

        System.out.println("\nyou went from floor 3 to here. in a dark room and surrounded by the tombs \n");

        while (choice >= 2 ) {
            System.out.println("1." + choices[0]); // choices array [0] look around

            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("the room is too dark, you put your hand against the wall and follow. then, you found 3 switches, one of them may turns on the light.\n");
            } else System.out.println("choose again");
        }
        System.out.println("\nInteract with these switches ?");
        System.out.println(choices[4]);
    }
}
