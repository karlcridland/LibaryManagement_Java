package com.company;
import javax.swing.*;
import java.awt.*;

public class Management {

    public static Management shared = new Management();
    private JFrame frame = new JFrame("Library Manager");

    private Management(){
        frame.setSize(800,500);
        frame.setLayout(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) (screenSize.getWidth()-800)/2,(int) (screenSize.getHeight()-500)/2);
        frame.setVisible(true);
    }

    // Removes anything on the screen before proceeding.

    void clearScreen(){

    }

    // Brings up the options of how the user would like to proceed.

    void home(){
        clearScreen();
    }

    // Displays every book in the library.

    void displayAll(){
        clearScreen();
    }

    // Displays every author in the library.

    void displayAuthors(){
        clearScreen();
    }

}
