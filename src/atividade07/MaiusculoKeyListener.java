package atividade07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MaiusculoKeyListener implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z'){
            ke.setKeyChar(Character.toUpperCase(ke.getKeyChar()));
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}