/*
2. Escreva um programa Java que implemente uma caixa de diálogo.
a) Crie uma classe chamada TestaCaixaDialogo com o bloco main.
b) Dentro do bloco, defina uma variável caixaDialogo inicializando-a com uma instância de JDialog.
c) Importe a classe javax.swing.JDialog.
d) Define o título "Caixa de diálogo" para a variável caixaDialogo.
e) Defina o tamanho 320x240 para a variável caixaDialogo.
f) Faça o botão fechar da variável caixaDialogo interromper a execução do programa.
g) Torne a caixa de diálogo visível.
i) Execute a classe TestaCaixaDialogo e observe o resultado.
j) Defina a operação JDialog.DISPOSE_ON_CLOSE para a variável caixaDialogo.
k) Execute a classe TestaCaixaDialogo e observe o resultado.
l) Adicione os arquivos no git remoto.
 */
package Atividade2;

import javax.swing.JDialog;

/**
 *
 * @author Leandro
 */
public class TestaCaixaDialogo {
    public static void main(String[] args) {
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setTitle("Caixa de dialogo");
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setModal(true);
        caixaDialogo.setVisible(true);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    
}
