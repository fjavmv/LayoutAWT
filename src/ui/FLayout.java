package ui;

import java.awt.*;

public class FLayout extends Frame {
    // defino tres objetos Button
    private Button b1, b2, b3;

    public FLayout() {
        // el constructor del padre recibe el titulo de la ventana
        super("Esta es la Ventana 1");
        // defino el layout que va a tener la ventana: FlowLayout
        setLayout(new FlowLayout());
        // instancio el primer boton y lo agrego al container
        b1 = new Button("Boton 1");
        add(b1);
        // instancio el segundo boton y lo agrego al container
        b2 = new Button("Boton 2");
        add(b2);
        // instancio el tercer boton y lo agrego al container
        b3 = new Button("Boton 3");
        add(b3);
        // defino el size de la ventana y la hago visible
        setSize(300, 300);
        addWindowListener(new Cerrar());

    }
}