/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290001
 */
public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame janela=new JFrame();
        janela.setTitle("Janela principal");
        janela.setSize(640, 480);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        JDialog caixaDialogo=new JDialog(janela, false);
        caixaDialogo.setTitle("Caixa Dialogo");
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);
              
    }
}
