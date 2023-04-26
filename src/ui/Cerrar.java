package ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Cerrar extends WindowAdapter {
    public void windowClosing( WindowEvent evt ) {
        // Concluye el programa cuando se cierra la ventana
        System.exit(0);
    }
}