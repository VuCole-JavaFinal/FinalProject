package actions;

import javax.swing.*;
import java.awt.*;

public class gotcha {
    public static void circleGame(){
        JFrame f = new JFrame(); //creates jframe f
        //        Timer t = new Timer(1000,this);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size

        ImageIcon image = new ImageIcon("C:\\Users\\vn317722\\Desktop\\New folder\\FinalProject\\src\\sounds\\download.jpg"); //imports the image

        JLabel lbl = new JLabel(image); //puts the image into a jlabel
        f.validate();
        f.getContentPane().add(lbl); //puts label inside the jframe

        f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size
        int x = (screenSize.width - f.getSize().width) / 2; //These two lines are the dimensions
        int y = (screenSize.height - f.getSize().height) / 2;//of the center of the screen
        f.dispose();
        f.setLocation(x = 460 , y = 0 ); //sets the location of the jframe
        f.setLocationRelativeTo(null);    //unslash this put the picture in the center of the screen
        f.setVisible(true); //makes the jframe visible
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        System.out.print("Got cha\nTry again?");

    }
}
