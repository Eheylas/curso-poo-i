/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JFrame;

/**
 *
 * @author 1714290055
 */
public class JanelaPrincipal extends JFrame {
    JanelaSobre janelaSobre;

    public JanelaPrincipal() {
        this.janelaSobre = new JanelaSobre(this, true);
    }
    
    public void exibir(){
        setTitle("Aplicação GUI");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        janelaSobre.exibir();
    }
    
}
