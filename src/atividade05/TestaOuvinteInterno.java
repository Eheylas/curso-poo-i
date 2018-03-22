/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author 1714290044
 */
public class TestaOuvinteInterno 
{
    public static class OuvidoInterno implements ActionListener(ActionEvent ae)
    {
        JOptionPane.showMessageDialog(null,"actionPerformed Disparado ...");
    }
}
