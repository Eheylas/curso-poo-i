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
 * @author 1714290026
 */
public class TestaCaixaDialogo {
    public static void main(String[] args) {
        JDialog dialogo = new JDialog();
        dialogo.setTitle("Caixa de diálogo");
        dialogo.setSize(320,240);
        dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogo.setVisible(true);
    }
}
