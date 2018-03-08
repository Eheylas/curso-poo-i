/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Yves Bodê
 */
public class TestaJPanel {
    public static void main(String[] args) {
        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
        
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        
        JFrame janela = new JFrame();
        janela.add(painel);
        painel.add(painel2);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
