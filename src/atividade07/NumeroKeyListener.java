package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class NumeroKeyListener implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() < KeyEvent.VK_0 || ke.getKeyCode() > KeyEvent.VK_9){
            JOptionPane.showMessageDialog(null, "A tecla pressionada não é numérico!");
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}