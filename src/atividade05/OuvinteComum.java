
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OuvinteComum implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "actionPerformed dispado...");
    }
    
}
