/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidade3.aula15;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FAS
 */
public class TestaBotaoApertar {

    public static void main(String[] args) {
        JButton botaoOk = new JButton("Ok");
        JButton botaoCancelar = new JButton("Cancel");
        JPanel painel = new JPanel();
        painel.add(botaoOk);
        painel.add(botaoCancelar);
        JFrame janela = new JFrame();
        janela.add(painel, BorderLayout.SOUTH);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
