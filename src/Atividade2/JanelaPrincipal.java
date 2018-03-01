/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class JanelaPrincipal extends JFrame{

    JanelaSobre janelaSobre;

    public JanelaPrincipal() throws HeadlessException {
        janelaSobre = new JanelaSobre(this, true);
        
    }
    
    void exibir(){
        setSize(640, 480);
        setTitle("Aplicacao GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        janelaSobre.exibir();
               
    }
    
    
  
}
