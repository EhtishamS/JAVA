package com.company;
import com.company.MyFrame;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class Frames {
    public static void main(String[] args) {
         /*
         JFrame frame = new JFrame(); // This create a frame but now this not visible
         frame.setTitle("My window"); // this sets the title of your Frame.
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close our frame and not hide it.
         frame.setResizable(false); // This will prevent user from resizing the window
         frame.setSize(420,420); // we can pass the parameters, or we can write it like this.
         frame.setVisible(true); // this will make the frame visible.

         ImageIcon image = new ImageIcon("Launcher_Image.png"); // create a image element
         frame.setIconImage(image.getImage()); // change the icon of the frame.

         frame.getContentPane().setBackground(new Color(123,50,250)); */
        //MyFrame myframe = new MyFrame("Hello",420,420,new ImageIcon("Launcher_Image.png"),new Color(123, 56, 251));

         MyFrame myframe = new MyFrame(); // this will simply make for us a frame.

    }
}
