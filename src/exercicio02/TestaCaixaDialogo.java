/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;
import javax.swing.JDialog;

/**
 *
 * @author 1714290032
 */
public class TestaCaixaDialogo {
    public static void main(String[] args) {
        JDialog janela = new JDialog();
        janela.setTitle("Caixa de diálogo");
        janela.setSize(320, 240);
        janela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        janela.setVisible(true);       
    }
}
