/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Yves Bodê
 */
public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setSize(640, 480);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);        
    }
}
