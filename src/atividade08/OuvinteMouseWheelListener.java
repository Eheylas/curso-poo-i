/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 *
 * @author 1714290026
 */
public class OuvinteMouseWheelListener implements MouseWheelListener {

    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) {
        System.out.println("Você girou o equivalente a " + mwe.getWheelRotation() + " clique(s) na barra de rolagem");
    }
    
}
