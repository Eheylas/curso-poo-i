/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author 1714290032
 */
import javax.swing.JFrame;
public class TestaJanelaPrincipal {
    public static void main(String[] args) {
       JFrame janela = new JFrame();
        janela.setTitle("Janela principal");
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setVisible(true);
    }
}
