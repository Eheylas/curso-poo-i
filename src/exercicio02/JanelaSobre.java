/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290001
 */
public class JanelaSobre extends JDialog{

    public JanelaSobre(Frame owner, boolean modal) {
        super(owner, modal);
    }
   
    public void exibir(){
        JFrame janela=new JFrame();
        janela.setTitle("Sobre");
        janela.setSize(320, 240);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }



}
