
package atividade08;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class OuvinteMouseListener implements MouseListener{

    
    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicou o botão" + me.getButton() + " " + me.getClickCount() + "vez(es)");
    }

   
    public void mousePressed(MouseEvent me) {
        System.out.println("Pressionou o botão" + me.getButton());
    }

    
    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberou o botão" + me.getButton());
    }

    
    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrou" + me.getButton());
    }

    
    public void mouseExited(MouseEvent me) {
        System.out.println("Saiu" + me.getButton());
    }
    
}
