package co.edu.utadeo;

import javax.swing.*;

public class App extends JFrame{

    private JPanel panel1;

    public App(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new App("App");
        frame.setVisible(true);
    }
}
