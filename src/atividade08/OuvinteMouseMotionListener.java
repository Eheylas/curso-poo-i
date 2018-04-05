package atividade08;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class OuvinteMouseMotionListener implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("Arrastando o mouse");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        System.out.println("Mouse na posição " + me.getLocationOnScreen());
    }
    
}