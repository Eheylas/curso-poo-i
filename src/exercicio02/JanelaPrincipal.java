/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290001
 */
public class JanelaPrincipal extends JFrame{
    
    private JanelaSobre janelaSobre ;

    public JanelaPrincipal() {
        janelaSobre= new JanelaSobre(this, true);
    }
    public void exibir(){
        this.setTitle("Aplicação GUI");
        this.setSize(640, 480);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        janelaSobre.exibir();
    }
    
}
