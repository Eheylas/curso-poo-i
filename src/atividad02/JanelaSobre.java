package atividad02;

import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*
 *
 * @author 1714290048
 */
public class JanelaSobre extends JDialog {

    public JanelaSobre(Frame frame, boolean bln) {
        super(frame, bln);
    }

    public void exibir() {
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setTitle("Sobre..");
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);
    }

}
