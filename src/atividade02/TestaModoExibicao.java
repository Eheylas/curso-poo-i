package atividade02;
import javax.swing.JDialog;
import javax.swing.JFrame;
/*
 * @author 1714290048
 */
public class TestaModoExibicao {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setSize(640,480);
        janelaPrincipal.setVisible(true);       
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE );
        caixaDialogo.setVisible(true);
    }
        
}