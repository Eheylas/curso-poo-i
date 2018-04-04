
package atividade08;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class OuvinteMouseWheelListener implements MouseWheelListener{

   
    public void mouseWheelMoved(MouseWheelEvent me) {
        System.out.println("Girou o botão de rolagem " + me.getWheelRotation() + "vez(es)" );
    }
    
}
