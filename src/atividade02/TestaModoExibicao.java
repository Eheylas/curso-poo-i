
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setSize(640,480);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
        
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);
        //Modal é uma janela que bloqueia o acesso as demais janelas, enquanto ela não é clicada.
        caixaDialogo.setSize(320,240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//Interromnper o modal
        caixaDialogo.setVisible(true);        
    }
}
