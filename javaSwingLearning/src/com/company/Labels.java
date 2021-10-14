package com.company;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class Labels {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Launcher_Image.png");
        Border border = BorderFactory.createLineBorder(new Color(0,255,0), 3); // This is allowing me to make a border of color green and thickness of 3.

        JLabel label = new JLabel(); // This creates a label
        label.setText("Hello how are you?"); // This used to set a label.
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // is used to position a text in CENTER, LEFT. RIGHT of the image
        label.setVerticalTextPosition(JLabel.TOP); // this will put our text on the top of the image.
        label.setForeground(new Color(0,255,0)); // this will change the color of our text.
        label.setFont(new Font("Mv Boli",Font.PLAIN,20));
        label.setIconTextGap(100); // This helps us to set a gap between the image and the text.
        label.setOpaque(true); // This will allow us to see what i've paintend in the background
        label.setBackground(new Color(0,0,0)); // this will set the background of my label to any color i want.
        label.setBorder(border); //

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.add(label); // this is used to add label to the frame.
    }
}
