import java.util.concurrent.TimeUnit;

public class Short {

    public static void timeDelay(){
        try{
            TimeUnit.SECONDS.sleep(9);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void medDelay(){
        try{
            TimeUnit.SECONDS.sleep(5);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void smallDelay(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void pl(String dialog){
        System.out.println(dialog);
    }


}
