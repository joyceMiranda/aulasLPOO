package oo.heranca;

public class AtletaAtletismo extends Atleta {
    
    private String modalidade;

    public AtletaAtletismo(String nomeAtleta, 
                           double salario, 
                           int tempoContrato,
                           String modalidade) {
        
        super(nomeAtleta, salario, tempoContrato);
        this.modalidade = modalidade;
    }
    
    
    
}
