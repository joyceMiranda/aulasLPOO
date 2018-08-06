package sintaxebasica.scanner;

import java.util.Scanner;

public class IntervaloParesComScanner {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o valor de X: ");
        int x= in.nextInt();
        
        System.out.println("Informe o valor de Y: ");
        int y= in.nextInt();        
        
        if(x >= y){
            System.out.println("Erro! Informe x < y");
        }else{
            System.out.println("Valores pares do Intervalo:");
            for(int i=x; i < y; i++){
                if( i%2 == 0 ){
                    System.out.print(" " + i);
                }
            }
        }
    }
    
}
