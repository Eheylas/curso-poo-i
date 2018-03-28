
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OuvinteAcaoGeral implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Acionou o comando " + e.getActionCommand()
        + " do componente " + e.getSource().getClass());
    }
    
}
