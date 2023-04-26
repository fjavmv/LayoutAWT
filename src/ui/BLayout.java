package ui;

import java.awt.*;

public class BLayout extends Frame {
    private Button bNorth,bSouth,bWest,bEast, bCenter;
    public BLayout()
    {
        super("Esta es la Ventana 2");
        setLayout(new BorderLayout() );
        bNorth=new Button("Norte");
        add(bNorth, BorderLayout.NORTH);
        bSouth=new Button("Sur");
        add(bSouth, BorderLayout.SOUTH);
        bWest=new Button("Oeste");
        add(bWest, BorderLayout.WEST);
        bEast=new Button("Este");
        add(bEast, BorderLayout.EAST);
        bCenter=new Button("Centro");
        add(bCenter, BorderLayout.CENTER);
        setSize(300,300);
        addWindowListener(new Cerrar());
        setVisible(true);
    }
}
