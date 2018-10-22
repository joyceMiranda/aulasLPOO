package oo.polimorfismo;

public class Professor extends Funcionario{
    
    private String area;
    private int titulacao;

    public Professor( 
            String nome, double salarioBruto, String funcao, 
            String area, int titulacao) {
        super(nome, salarioBruto, funcao);
        this.area = area;
        this.titulacao = titulacao;
    }
    
    
    
}
