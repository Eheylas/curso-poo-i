
package atividade01;

public class Pessoa {
    public static final int SEXO_MASCULINO = 1; 
    public static final int SEXO_FEMININO = 2;
    private String nome;
    private String sexo;

    Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public static int getSEXO_MASCULINO() {
        return SEXO_MASCULINO;
    }

    public static int getSEXO_FEMININO() {
        return SEXO_FEMININO;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
    
    
    
    
    
}
