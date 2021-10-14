package com.company;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;

public class MyFrame extends JFrame { // it's a child class of the JFrame

    // this. --> is used to set that you are using JFrame because you are in a child class of JFrame

    MyFrame(){ // this is by default
        this.setTitle("My window"); // this sets the title of your Frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close our frame and not hide it.
        this.setResizable(false); // This will prevent user from resizing the window
        this.setSize(420,420); // we can pass the parameters, or we can write it like this.
        this.setVisible(true); // this will make the frame visible.

        ImageIcon image = new ImageIcon("Launcher_Image.png"); // create a image element
        this.setIconImage(image.getImage()); // change the icon of the this.

        this.getContentPane().setBackground(new Color(123,50,250));
    }

    MyFrame(String nameWindow, int width, int height, ImageIcon image, Color color){ // this is user want some custom things
        this.setTitle(nameWindow); // this sets the title of your Frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close our frame and not hide it.
        this.setResizable(false); // This will prevent user from resizing the window
        this.setSize(width,height); // we can pass the parameters, or we can write it like this.
        this.setVisible(true); // this will make the frame visible.

        this.setIconImage(image.getImage()); // change the icon of the this.

        this.getContentPane().setBackground(color); // this will change the background color of my page
    }
}
