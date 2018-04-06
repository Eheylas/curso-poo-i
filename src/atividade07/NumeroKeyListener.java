/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class NumeroKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() < KeyEvent.VK_0 || e.getKeyCode() > KeyEvent.VK_9) {
            JOptionPane.showMessageDialog(null, "A tecla pressionada não é númerica!");
        }
    }
    
}
