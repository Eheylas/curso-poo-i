
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OuvinteAcao implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Uma ação foi executada");
        
    }
    
}
