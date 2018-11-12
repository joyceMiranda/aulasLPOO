package sintaxebasica;

public class IntervaloPares {

    public static void main(String[] args) {
        int x=15, y=30;
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
