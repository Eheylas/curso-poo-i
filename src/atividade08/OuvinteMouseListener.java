/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author 1714290026
 */
public class OuvinteMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicou o botão " + me.getButton() + " " + me.getClickCount() + " vez(es).");
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
