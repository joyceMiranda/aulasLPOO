package oo.metodos;

public class Conta {
    
    public int numero;
    public String nomeCliente;
    public double saldo;
    public double limite;
    
    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }else{
            this.saldo = this.saldo + valor;
            return true;
        }        
    }
    
    public boolean sacar(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
}
