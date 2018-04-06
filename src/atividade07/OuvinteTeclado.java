/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class OuvinteTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressionou a tecla " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
