package oo.heranca;

public class Atleta {
    
    protected String nomeAtleta;
    protected double salario;
    protected int tempoContrato;

    public Atleta(String nomeAtleta, 
                  double salario, 
                  int tempoContrato) {
        this.nomeAtleta = nomeAtleta;
        this.salario = salario;
        this.tempoContrato = tempoContrato;
    }
    
    public double calcValorContrato(){
        return this.salario * this.tempoContrato;
    }
    
}
