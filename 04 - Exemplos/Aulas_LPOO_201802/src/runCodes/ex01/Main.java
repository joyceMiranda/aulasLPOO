package runCodes.ex01;

 
import java.text.DecimalFormat;
import java.util.Scanner;


class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0.0;
        double  media = 0.0;
        for (int i = 0; i < 10; i++) {
            soma = soma + in.nextDouble();
        }
        media = (double) soma/10;
        
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Soma = " + df.format(soma));
        System.out.println("Média = " + df.format(media));
    }
    
}
