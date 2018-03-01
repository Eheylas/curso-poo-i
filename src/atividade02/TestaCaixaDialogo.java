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
 * @author 1714290010
 */
public class TestaCaixaDialogo {
    public static void main(String[] args) {
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setTitle("Caixa de Dialogo");
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);
        
    }
}
