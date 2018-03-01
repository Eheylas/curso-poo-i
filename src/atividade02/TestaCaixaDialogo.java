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
 * @author 1714290055
 */
public class TestaCaixaDialogo {
    public static void main (String[] args){
        JFrame janela = new JFrame();
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        JDialog caixaDialogo = new JDialog(janela);
        caixaDialogo.setTitle("Caixa de Diálogo");
        caixaDialogo.setModal(true);
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);
    }
    
}
