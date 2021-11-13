package mainPackage;

import javax.swing.*;

public class EmptyWindow extends JFrame {
    public EmptyWindow(String title, int width, int height, int x, int y){
        super(title);
        setSize(width, height);
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
}
