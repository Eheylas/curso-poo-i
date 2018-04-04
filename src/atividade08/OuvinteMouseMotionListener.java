
package atividade08;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class OuvinteMouseMotionListener implements MouseMotionListener{

    
    public void mouseDragged(MouseEvent me) {
        System.out.println("Arrastando o mouse " + me.getX() + " " + me.getY() );
    }

    
    public void mouseMoved(MouseEvent me) {
        System.out.println("Movimentando o mouse " + me.getX() + " " + me.getY() );
    }
    
    
}
