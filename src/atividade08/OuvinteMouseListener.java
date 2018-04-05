package atividade08;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*
 * @author 1714290048
 */
public class OuvinteMouseListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicou um botão do mouse");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Pressionou um botão do mouse");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberou um botão do mouse");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrou");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Saiu");
    }
    
}
