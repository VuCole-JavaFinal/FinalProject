//The room you enter immediately after you leave the attic.
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RoomThree {

    public static void main(String[] args){

        String choice = null;
        boolean living = true;

        Scanner input = new Scanner(System.in);

        while(living) {
            Shortcut.pl("You drop into the room from your former prison. The immediate smell of rotten meat is overpowering,\n" +
                    "and you resist the urge to vomit. You can't seem to pinpoint the source of where the smell originates,\n" +
                    "but it fills you with an immediate sense of dread, and it seems easier to give up at this point.");
            System.out.println();
            Shortcut.timeDelay();
            Shortcut.pl("You take a moment to scan your surroundings. You see the rotting carcasses of some unidentifiable \n" +
                    "animal in the corner of the room. Well, now you know where the smell is coming from. You also happen\n" +
                    "to see a door, and it appears to have some light filtering through. ");
            System.out.println();
            Shortcut.timeDelay();
            Shortcut.pl("Do you are peek inside? Yes or No.");
            choice = input.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                choiceOneY(input, choice);
            }
            else if (choice.equalsIgnoreCase("no")) {
                choiceOneN(input, choice);

            }
        }
    }
    public static void choiceOneY(Scanner input, String choice){
        Shortcut.pl("You muster up the courage and head for the door. As you place your hand upon it, you begin\n" +
                "to hear loud chopping sounds. As you push the door further open, you see a man in a butcher's\n" +
                "robe, chopping some sort of meat. The man is heavily stained in blood.");
        Shortcut.timeDelay();
        Shortcut.pl("You don't dare to talk to the man; you know it will end horribly on your part. But, you also\n" +
                "see a door to the left in the back of the room, it could be a possible exit. ");
    }
    public static void choiceOneN(Scanner input, String choice){
        Shortcut.pl("You decide that curling up into a ball in the corner and crying is an idea that suits you\n" +
                "better than facing your fear. You clamber upon a pile of rotting meat, and begin to bawl\n" +
                "your eyes out. Sadly, crying gets you nowhere, and you begin to rot away with the pile of meat. ");
        System.out.println();
        Shortcut.timeDelay();
        Graphics.deathScreen();
        System.out.println();
    }
}
