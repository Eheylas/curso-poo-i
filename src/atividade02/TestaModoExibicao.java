package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290040
 */
public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setSize(640,480 );
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true); //deixa a janela visivel
        
        //JDialog caixaDialogo = new JDialog(janelaPrincipal, false); original
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);
        caixaDialogo.setSize(320,240 );
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//não seria DISPOSE_ON_CLOSE
        caixaDialogo.setVisible(true);
        
    }
            
}
