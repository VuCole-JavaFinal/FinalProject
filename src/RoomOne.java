import java.util.Scanner;

public class RoomOne {

    public static void main(String[] args){

        String choice = null;
        boolean runGame = true;

        Scanner input = new Scanner(System.in);

        while(runGame){

            Short.pl("The room you enter is the largest of them all, and a massive door occupies the front. Soon, you hear \n" +
                    "strange noises coming from behind you. You turn around to see what it is, and you're shocked to find an\n" +
                    "ant-like creature leaning against the wall.");
            System.out.println();
            Short.timeDelay();
            Short.pl("The ant doesn't move, but it makes faint noises, giving you the impression that it is hurt. You muster\n" +
                    "your courage and take a closer look, and you see that its eyes are bleeding.");
            Short.smallDelay();
            System.out.println();
            Short.pl("'Hello,' the ant says. Its human-like response scares you and you haul away from the ant. When you regain\n" +
                    "your courage, you walk back up to it willing to ask it some questions.");
            int answer = 0;
            while(answer == 0){
                Short.pl("A.'Who are you?'\n" +
                        "B.'You can talk?'\n" +
                        "C.'Are you OK?'");
                choice = input.nextLine();
                if(choice.equalsIgnoreCase("A")) {

                    Short.pl("'Who are you?' you ask.");
                    System.out.println();
                    Short.smallDelay();
                    Short.pl("'I was a normal ant who drank some polluted water, so now I'm radioactive, which goes to explain my\n" +
                            "size, as well as why I can talk. You can just call me Antonio.'");
                    Short.smallDelay();
                    System.out.println();
                    answer++;
                }
                Short.pl("Ask another question:");
                if(choice.equalsIgnoreCase("B")){

                    Short.pl("'You can talk?'");
                    Short.smallDelay();
                    Short.pl("Well, yeah, that's kinda obvious.");
                }
            }
        }
    }
}
