package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290040
 */
public class TestaCaixaDialogo {
    public static void main(String[] args) {
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setTitle("Caixa de diálogo");
        caixaDialogo.setSize(320,240);
        caixaDialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// erro
        caixaDialogo.setVisible(true);
    }
    
}
