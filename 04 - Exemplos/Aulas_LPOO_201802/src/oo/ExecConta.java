package oo;

public class ExecConta {
    public static void main(String[] args) {
        
        Conta minhaConta = new Conta();
        minhaConta.numero = 123;
        minhaConta.nomeCliente = "Fulano";
        minhaConta.saldo = 1000.00;
                
        System.out.println("O saldo da conta de "
                + minhaConta.nomeCliente 
                + " é R$ " + minhaConta.saldo);
        
        Conta outraConta = new Conta(321, "Ciclano", 2000.00);
        
        System.out.println("O saldo da conta de "
                + outraConta.nomeCliente 
                + " é R$ " + outraConta.saldo);
        
    }
}
