package oo.heranca;
public class AtletaFutebol extends Atleta {
    
    private String clube;
    private String posicao;

    public AtletaFutebol(String nomeAtleta, 
                         double salario, 
                         int tempoContrato,
                         String clube, 
                         String posicao) {
        super(nomeAtleta, salario, tempoContrato);
        this.clube = clube;
        this.posicao = posicao;
    }    
}
