/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author 1714290001
 */
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
