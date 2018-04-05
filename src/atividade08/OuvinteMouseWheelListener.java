package atividade08;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class OuvinteMouseWheelListener implements MouseWheelListener{

    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) {
        System.out.println("Você girou o equivalente a " + mwe.getWheelRotation()
                + " clique(s) na barra de rolagem");
    }
    
}