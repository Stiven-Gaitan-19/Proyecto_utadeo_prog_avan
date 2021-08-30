package co.edu.utadeo;

import co.edu.utadeo.config.ConfigDB;
import co.edu.utadeo.controller.evento.EventoController;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ConfigDB.getInstance();// Crear coneccion

                JFrame frame = new EventoController();
                frame.setSize(582,490);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}
