package oo.heranca;

public class ExecAtleta {
    public static void main(String[] args) {
        
        AtletaFutebol af =
                new AtletaFutebol(
                        "Neymar", 
                        1000000.00,
                        12,
                        "PSG",
                        "atacante");
        double valorContrato = af.calcValorContrato();
        System.out.println("Contrato de " + af.nomeAtleta +
                " vale: "+ valorContrato);
        
        AtletaAtletismo aa =
                new AtletaAtletismo(
                        "Bolt",
                        500000.00,
                        12,
                        "corrida");
        valorContrato = aa.calcValorContrato();
        System.out.println("Contrato de " + aa.nomeAtleta +
                " vale: "+ valorContrato);
    }  
}
