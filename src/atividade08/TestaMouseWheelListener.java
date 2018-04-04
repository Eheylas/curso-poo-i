/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade08;

import javax.swing.JFrame;

/**
 *
 * @author 1714290026
 */
public class TestaMouseWheelListener {
    
    public static void main(String[] args) {
        OuvinteMouseWheelListener ouvinte = new OuvinteMouseWheelListener();
        JFrame janela = new JFrame();
        janela.addMouseWheelListener(ouvinte);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
