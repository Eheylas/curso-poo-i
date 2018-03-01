/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import java.awt.Frame;
import javax.swing.JDialog;

/**
 *
 * @author 1714290055
 */
public class JanelaSobre extends JDialog {

    public JanelaSobre(Frame frame, boolean bln) {
        super(frame, bln);
    }
    public void exibir(){
        setTitle("Sobre...");
        setSize(320, 240);
        setVisible(true);
    }
    
}
