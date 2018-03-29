/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 *
 * @author 1714290001
 */
public class OuvinteWindowStateListener implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent we) {
        System.out.println("\"A janela passou de \" + e.getOldState() + \" para \" + e.getNewState()");
    }
    
}
