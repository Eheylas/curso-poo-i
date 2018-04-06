/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Yuri Inoue
 */
public class TestaOuvinteAcaoGeral {
    public static void main(String[] args) {
        OuvinteAcaoGeral ouvinte = new OuvinteAcaoGeral();
        JButton botao = new JButton("OK");
        JTextField campo = new JTextField(30);
        botao.addActionListener(ouvinte);
        campo.addActionListener(ouvinte);
        
        JFrame janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.setSize(500,300);
        janela.add(botao);
        janela.add(campo);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
