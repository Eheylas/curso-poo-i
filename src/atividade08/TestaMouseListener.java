package atividade08;
import javax.swing.JFrame;
/*
 * @author 1714290048
 */
public class TestaMouseListener {

    public static void main(String[] args) {
        OuvinteMouseListener ouvinte = new OuvinteMouseListener();
        JFrame janela = new JFrame();
        janela.addMouseListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

 

