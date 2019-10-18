import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Room1 {
    public static void room1(){
        int randomFall;
        int minute = 0;
        Random rand = new Random();
        randomFall = rand.nextInt(10)+1;
        for (randomFall = 0; randomFall < 10; randomFall++) {
            randomFall = rand.nextInt(10) + 1;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.print(".\n");
            minute++;
        }
        System.out.println("it took you " + minute + " min to drop down to here");
        if (minute <= 4 ){
            System.out.print("that's pretty quick \n\n");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            AntonioTheAnt();
        }
        else if (minute >= 5){
            System.out.print("it took so long \n\n");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            AntonioTheAnt();
        }
    }
    public static void AntonioTheAnt(){
        System.out.println("\nThis room is the biggest room compared to the others, with a big door on the front. \n"+
                "Soon, I heard some weird noises behind my back.");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("\nI turned around to see what it is, and I was shocked when i see a big ant sit on the floor and leaned against the wall.");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.print("\nThe ant didn’t move, it makes weird noises like it’s injured. I take all of my courage and take a closer look, I saw it’s eyes are bleeding.\n\n");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        Dialog();
    }
    public static void Dialog(){
        int choice;
        Scanner input = new Scanner(System.in);
        boolean question1 = false;
        boolean question2 = false;
        boolean question3 = false;
        String[] questions  = {"who are you ?","You can talk ?","Are you ok ?"};
        System.out.print("???: Hello ?\n");
        delay.delay3();
        System.out.print("\n\''me:!!!!??\''"+" I scared and ran far away from the ant.\n\n");
        delay.delay3();
        System.out.print("Note from creators: this part takes time to loop so we DIDN'T make loop for this part.\nplease choose carefully\n\n");
        System.out.print("1." + questions[0] +"\n");
        System.out.print("2." +questions[1] +"\n");
        System.out.print("3." +questions[2] +"\n");
        choice = input.nextInt();
        while (question1 || question2 || question3 != true){
            if (choice == 1){
                System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio\n");
                question1 = true;
                System.out.print("1." + questions[1] +"\n");
                System.out.print("2." + questions[2] +"\n");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("???:yes\n");
                    question2 = true;
                    System.out.print("1." + questions[2] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("am I look like i'm ok ???\n");
                        question3 = true;
                        break;
                    }
                }
                else if (choice == 2) {
                    System.out.print("am I look like i'm ok ???\n");
                    question3 = true;
                    System.out.print("1." + questions[1] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???:yes\n");
                        question2 = true;
                        break;
                    }
                }
            }
            else if (choice == 2){
                System.out.print("???:yes\n\n");
                question2 = true;
                System.out.print("1." + questions[0] +"\n");
                System.out.print("2." + questions[2] +"\n");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio\n\n");
                    question1 = true;
                    System.out.print("1." + questions[2] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("???:am I look like i'm ok ???\n");
                        question3 = true;
                        break;
                    }
                }
                else if (choice == 2) {
                    System.out.print("???:am I look like i'm ok ???\n");
                    question3 = true;
                    System.out.print("\n1." + questions[0] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio\n\n");
                        question1 = true;
                    }
                }
                break;
            }
            else if (choice == 3){
                System.out.print("am I look like i'm ok ??? \n\n");
                question3 = true;
                System.out.print("1." + questions[0] +"\n");
                System.out.print("2." + questions[1] +"\n");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio\n\n");
                    question1 = true;
                    System.out.print("1." + questions[1] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???:yes\n");
                        question2 = true;
                        break;
                    }
                }
                else if (choice == 2) {
                    System.out.print("\n\n???:yes\n");
                    question2 = true;
                    System.out.print("\n1." + questions[0] +"\n");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.print("\n???:I’m a radioactive ant, that's why i’m this big and can talk, just call me Antonio\n\n");
                        question1 = true;
                    }
                }
                break;
            }
        }
        if (question1 && question2 && question3 == true){
            Dialogue2();
        }
    }
    public static void Dialogue2(){
        int choice = 2 ;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nme: why am I here ?");
        delay.delay3();
        System.out.println("\nAntonio: this is an uninhabited house in Saurine forest");
        delay.delay3();
        System.out.println("\nMe: Saurine forest is a place where a lot of strange and unidentifiable things have happened but no one know the answer of it.\n" +
                "Some unfortunate people disappeared or being kidnapped near Saurine Forest ");
        while ( choice >=2 ){
            System.out.println("\n1.how can I get out of this place ?");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Me:how can I get out of this place ?");
                Dialogue3();
                break;
            }
            System.out.println("\nchoose again");
        }
    }
    public static void Dialogue3() {
        String[] helpOrNot = {"help","no"};
        int choice = 2;
        int choice2 = 2 ;
        Scanner input = new Scanner(System.in);
        delay.delay3();
        System.out.println("\nAntonio: I know this may help you");
        System.out.println("\n1.what is it?");
        while (choice >= 2) {
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Me:what is it ?");
                delay.delay3();
                System.out.println("\nAntonio: Do you see a two-headed fox over there. He ate the key when he was too hungry, in order to get the key, you have to slaughter the fox."+
                        "\nI have an axe in my house. If you help me, i'll give you the key to my house and give you the axe.");
                delay.delay3();
                System.out.println("\n1."+ helpOrNot[0]);
                System.out.println("2."+ helpOrNot[1]);
//            choice2 = input.nextInt();
                while ( choice2 >= 1) {
                    choice2 = input.nextInt();
                    if (choice2 == 1) {
                        System.out.println("\nMe:Ok, deal. What do you want ?");
                        delay.delay3();
                        helpAntonio();
                        break;
                    } else if (choice2 == 2) {
                        System.out.println("\"helping him maybe the only way out, lets try\" \n");
                    }
                    else
                        System.out.println("choose again");
                }
                break;
            }
            System.out.println("\nchoose again");

        }
    }
    public static void helpAntonio(){
        delay.delay3();
        System.out.println("\nAntonio: there are some painkillers and bandages down the basement, can you help me get them ?");
        delay.delay3();
        System.out.println("\nMe: Sure");
        delay.delay3();
        System.out.println("\nYou went down the basement. It looks dark,old, smelly, spider webs everywhere.  You saw a small box, open it ? .");

    }
}
