/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290032
 */
public class JanelaSobre extends JDialog {

    public JanelaSobre(Frame frame, boolean bln) {
        super(frame, bln);
    }

    public void exibir() {
        setSize(320, 240);
        setTitle("Sobre...");
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
