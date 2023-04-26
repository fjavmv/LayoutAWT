package ui;

import java.awt.*;

public class GLayout extends Frame {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public GLayout(){

        super("Esta es la Ventana 3");
        setLayout(new GridLayout(3,3) );
        b1=new Button("Boton 1");
        add(b1);
        b2=new Button("Boton 2");
        add(b2);
        b3=new Button("Boton 3");
        add(b3);
        b4=new Button("Boton 4");
        add(b4);
        b5=new Button("Boton 5");
        add(b5);
        b6=new Button("Boton 6");
        add(b6);
        b7=new Button("Boton 7");
        add(b7);
        b8=new Button("Boton 8");
        add(b8);
        b9=new Button("Boton 9");
        add(b9);
        setSize(300,300);
        addWindowListener(new Cerrar());
        setVisible(true);
    }
}
