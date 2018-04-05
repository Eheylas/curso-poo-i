package atividade08;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
/*
 * @author 1714290048
 */
public class OuvinteMouseWheelListener implements MouseWheelListener{

    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) {
        System.out.println("Girou o botão de rolagem");
    }
    
}
