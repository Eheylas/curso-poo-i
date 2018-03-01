/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaModoExibicao {

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");
        janela.setSize(640, 480);
        janela.setVisible(true);
        JDialog dialogo = new JDialog(janela);
        dialogo.setModal(true);
        dialogo.setSize(320, 240);
        dialogo.setVisible(true);
    }
}
