/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Yves Bodê
 */
public class JanelaSobre extends JDialog {

    public JanelaSobre(JFrame owner, boolean modal) {
        super(owner, modal);
    }
    
    /**
     *
     */
    public void exibir(){
       this.setSize(320, 240);
       this.setTitle("Sobre...");
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }
    
    
    
}
