/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

/**
 *
 * @author 1714290026
 */
public class OuvinteWindowFocusListener implements WindowFocusListener {

    @Override
    public void windowGainedFocus(WindowEvent we) {
        System.out.println("Janela ganhou o foco");
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
        System.out.println("Janela perdeu o foco");
    }
    
}
