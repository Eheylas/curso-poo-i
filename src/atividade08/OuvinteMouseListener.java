package atividade08;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OuvinteMouseListener implements MouseListener{
    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicou o botão" + me.getButton() +  " " + me.getClickCount() + " vez (es).");
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("Pressionou um botão do mouse.");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberou um botão do mouse.");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrou.");
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("Saiu.");
    }
    
    
}
