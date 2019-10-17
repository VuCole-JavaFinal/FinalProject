import java.util.concurrent.TimeUnit;

public class Shortcut {

    public static void timeDelay(){
        try{
            TimeUnit.SECONDS.sleep(9);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void pl(String dialog){
        System.out.println(dialog);
    }
}
