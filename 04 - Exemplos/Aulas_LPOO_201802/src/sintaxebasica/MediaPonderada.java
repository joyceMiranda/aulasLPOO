package sintaxebasica;

import java.text.DecimalFormat;

public class MediaPonderada {
    
    public static void main(String[] args) {
        
        double n1=6.0, n2=5.0, n3=3.0, media; 
        int p1=1, p2=2, p3=3;
        String aluno = "João";
        
        media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
        
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("A média de " + 
                           aluno + " foi " + df.format(media));
        
    }
    
}
