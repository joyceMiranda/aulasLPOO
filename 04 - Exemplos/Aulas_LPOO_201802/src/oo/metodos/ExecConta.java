package oo.metodos;

import java.util.Scanner;

public class ExecConta {
    
    public static void main(String[] args) {
        
        Conta c = new Conta();
        
        System.out.println("Saldo Atual: " + c.saldo);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o valor do depósito:");
        double valor = in.nextDouble();
        
        boolean depositou  = c.depositar(valor);
        if(depositou){
            System.out.println("DEPÓSITO Ok!");
        }else{
            System.out.println("DEPÓSITO NÃO OK!");
        }
        
        System.out.println("Saldo Atual: " + c.saldo);
        
        System.out.println("Informe o valor do saque:");
        valor = in.nextDouble();
        
        boolean sacou = c.sacar(valor);
         if(sacou){
            System.out.println("SAQUE Ok!");
        }else{
            System.out.println("SAQUE NÃO OK!");
        }
        
        System.out.println("Saldo Atual: " + c.saldo);

    }
    
}
