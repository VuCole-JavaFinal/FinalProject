//The room you enter immediately after you leave the attic.
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RoomThree {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.println("You drop into the room from your former prison. The immediate smell of rotten meat is overpowering,\n" +
                "and you resist the urge to vomit. You can't seem to pinpoint the source of where the smell originates,\n" +
                "but it fills you with an immediate sense of dread, and it seems easier to give up at this point.");
        System.out.println();
        try{
            TimeUnit.SECONDS.sleep(5);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("You take a moment to scan your surroundings. You see rotting carcasses in the corner of the room ");


    }
}
