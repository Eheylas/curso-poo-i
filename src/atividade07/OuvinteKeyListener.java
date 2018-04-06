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
public class OuvinteKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Digitou uma tecla");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressionou uma tecla");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Liberou uma tecla");
    }
    
}
