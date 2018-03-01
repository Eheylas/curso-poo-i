/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JFrame;

/**
 *
 * @author 1714290007
 */
import javax.swing.JFrame;
        
public class TestaJanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");
        janela.setSize(640, 480);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }
}
