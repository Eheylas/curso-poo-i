
package atividade02;

import javax.swing.JFrame;

public class TestaJanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela Principal");//Nome da janela
        janela.setSize(640, 480);//Tamanho da janela
        janela.setVisible(true);//Visualizaçao da janela
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
