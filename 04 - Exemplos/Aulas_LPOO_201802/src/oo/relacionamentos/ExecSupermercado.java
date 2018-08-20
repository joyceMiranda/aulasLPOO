package oo.relacionamentos;

import java.util.Scanner;

public class ExecSupermercado {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char continua = 'S';
        int qtdeMaximaItens = 2;
        Produto[] itens = new Produto[qtdeMaximaItens];
        int i = 0;
        do{
            System.out.println("Deseja incluir novos produtos?");
            continua = in.next().charAt(0);
            if(continua == 'N'){
                break;
            }
            Produto produto = new Produto();
            System.out.println("Informe o código do produto:");
            produto.codigo = in.nextInt();
            System.out.println("Informe o nome do produto:");
            produto.nome = in.next();
            System.out.println("Informe o valor do produto:");
            produto.valor = in.nextDouble();

            Categoria categoria = new Categoria();
            System.out.println("Informe o código da categoria:");
            categoria.codigo = in.nextInt();
            System.out.println("Informe o nome da categoria:");
            categoria.nome = in.next();

            produto.categoria = categoria;
            
            itens[i] = produto;
            i++;
            if(i >= qtdeMaximaItens){
                break;
            }
        }while(continua == 'S');
        
       Pedido pedido = new Pedido();
       System.out.println("Informe o número do pedido:");
       pedido.numero = in.nextInt();
       System.out.println("Informe o cliente do pedido:");
       pedido.cliente = in.nextLine();
       pedido.itens = itens;
       
       
       
        
        
        
        
        
        
    }
    
}
