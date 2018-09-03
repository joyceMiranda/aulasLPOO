package oo.metodos;

public class Comparador {
    
    public int maiorValor(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    
    public int maiorValor(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
    
}
