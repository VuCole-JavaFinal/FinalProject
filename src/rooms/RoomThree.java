package rooms;//The room you enter immediately after you leave the attic.
import java.util.Scanner;
import actions.Short;
import pictureCall.Graphics;
public class RoomThree {

    public static void roomThree() {

        String choice;
        boolean runGame = true;

        Scanner input = new Scanner(System.in);

        while(runGame) {
            Short.pl("You drop into the room from your former prison. The immediate smell of rotten meat is overpowering,\n" +
                    "and you resist the urge to vomit. You can't seem to pinpoint the source of where the smell originates,\n" +
                    "but it fills you with an immediate sense of dread, and it seems easier to give up at this point.");
            System.out.println();
            Short.timeDelay();
            Short.pl("You take a moment to scan your surroundings. You see the rotting carcasses of some unidentifiable \n" +
                    "animals in the corner of the room. Well, now you know where the smell is coming from. You also happen\n" +
                    "to see a door, and it appears to have some light filtering through. ");
            System.out.println();
            Short.timeDelay();
            Short.pl("Do you dare peek inside? Pick Yes or No:");
            choice = input.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                Short.pl("You muster up the courage and head for the door. As you place your hand upon it, you begin\n" +
                        "to hear loud chopping sounds. As you push the door further open, you see a man in a butcher's\n" +
                        "robe, chopping some sort of meat. The man is heavily stained with blood.");
                System.out.println();
                Short.timeDelay();
                Short.pl("You don't dare to talk to the man; you know it will end horribly on your part. But, you also\n" +
                        "see a door to the left in the back of the room, it could be a possible exit. On the other hand, you see some\n" +
                        "knives laying on a table over to your right. You could try to use them to remove chances of getting caught\n" +
                        "and meeting your demise.\n" +
                        "Pick Left or Right:");
                choice = input.nextLine();
                if(choice.equalsIgnoreCase("left")){
                    System.out.println();
                    Short.pl("You crouch down low, and use the aid of a nearby counter to avoid getting caught. You sneak up\n" +
                            "to the door, and open it as slowly as you can, as to not make any sound. You successfully pull the door open\n" +
                            "with minimal noise, and you sneak through.");
                    System.out.println();
                    Short.timeDelay();
                    Short.pl("Upon entering the new room, you see two completely identical doors, but that should make a decision\n" +
                            "completely unbiased. Each door may hold something interesting, or it could hold certain death.\n" +
                            "Pick Left or Right:");
                    choice = input.nextLine();
                    if(choice.equalsIgnoreCase("right")){
                        Short.pl("You decide that the right door is the choice for you, and you push it open. Upon opening the\n" +
                                "door, you find a pedestal with a key. You decide that you'll need the key, so you grab it and shove it\n" +
                                "in your pocket.");
                        System.out.println();
                        Short.timeDelay();
                        Short.pl("But, upon grabbing the key, the floor buckles beneath you, and you fall through.");
                        RoomTwo.room2();
                        runGame = false;
                    }
                    else if(choice.equalsIgnoreCase("left")){
                        Short.pl("You believe that the door on the left will be the smarter decision. You pull the door open to find\n" +
                                "nothing. You walk in to see if there may be anything special, but as you take your first step in, you\n" +
                                "trigger a tripwire, setting off a classic arrow trap. Hey, at least you died in a somewhat cool\n" +
                                "way. Well, not really.");
                        System.out.println();
                        Graphics.deathScreen();
                        System.out.println();
                        Short.pl("Try again?");
                        choice = input.nextLine();
                        if(choice.equalsIgnoreCase("no")){
                            runGame = false;
                        }
                    }
                }
                else if(choice.equalsIgnoreCase("right")){
                    Short.pl("You crouch down low, and make your way towards the knives. Unfortunately, you stumble on an\n" +
                            "animal bone laying on the floor, making a very loud clatter. There is no way he didn't hear you.");
                    System.out.println();
                    Short.timeDelay();
                    Short.pl("You are found out quickly, and the man makes quick work of you, dissecting your body with\n" +
                            "extreme precision.");
                    System.out.println();
                    Short.timeDelay();
                    Graphics.deathScreen();
                    System.out.println();
                    Short.pl("Try again?");
                    choice = input.nextLine();
                    if(choice.equalsIgnoreCase("no"))
                        runGame = false;
                }

            } else if (choice.equalsIgnoreCase("no")) {
                Short.pl("You decide that curling up into a ball in the corner and crying is an idea that suits you\n" +
                        "better than facing your fear. You clamber upon a pile of rotting meat, and begin to bawl\n" +
                        "your eyes out. Sadly, crying gets you nowhere, and you begin to rot away with the pile of meat. ");
                System.out.println();
                Short.timeDelay();
                Graphics.deathScreen();
                System.out.println();
                Short.pl("Try again?");
                choice = input.nextLine();
                System.out.println();
                if (choice.equalsIgnoreCase("no")) {
                    runGame = false; //ends the game
                }
            }
        }
    }
}