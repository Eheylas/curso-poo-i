/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import javax.swing.JFrame;

/**
 *
 * @author 1714290010
 */
public class JanelaPrincipal extends JFrame{
    private JanelaSobre janelaSobre;

    public JanelaPrincipal() {
        janelaSobre = new JanelaSobre(this, true);
    }
    
    public void exibir() {
        this.setSize(640, 480);
        this.setTitle("Aplicação GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        janelaSobre.exibir();
    }
    

}
