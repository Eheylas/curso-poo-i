/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JFrame;

/**
 *
 * @author 1714290026
 */
public class JanelaPrincipal extends JFrame {
    JanelaSobre janelaSobre;
    
    public JanelaPrincipal() {
        janelaSobre = new JanelaSobre(this,true);
    }
    
    public void exibir() {        
        setSize(640,480);
        setTitle("Aplicação GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
        janelaSobre.exibir();
    }
}
