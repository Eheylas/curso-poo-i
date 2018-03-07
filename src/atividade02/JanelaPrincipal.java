
package atividade02;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
    JanelaSobre janelaSobre;

    public JanelaPrincipal(JanelaSobre janelaSobre) {
        this.janelaSobre = janelaSobre; //Falta atribuir janelaSobre com uma instância modal
    }
    public void exibir(){
        setSize(640,480);
        setTitle("Aplicação GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        janelaSobre.exbir();
        
    }
    
}
