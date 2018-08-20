package oo;

import java.util.Scanner;

public class ExecPessoa {
    
    public static void main(String[] args) {
        
        Scanner  in = new Scanner(System.in);
        
        //instanciar a classe
        //criar um novo objeto
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe o cpf:");
        pessoa.cpf = in.nextLong();
        System.out.println("Informe o nome:");
        pessoa.nome = in.next();
        
        System.out.println("Cpf: " + pessoa.cpf + " \n"
                + "Nome: " + pessoa.nome);
    }
    
}
