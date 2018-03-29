/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author 1714290024
 */
public class Janela extends JFrame {

    public Janela() throws HeadlessException {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        
    }
    
}
