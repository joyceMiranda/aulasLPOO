package oo.metodos;

public class ExecComparador {
    
    public static void main(String[] args) {
        
        Comparador comp = new Comparador();
        
        int maiorValor = comp.maiorValor(10, 5);
        
        System.out.println(" " + maiorValor);
        
        maiorValor = comp.maiorValor(10, 5, 100);
        
        System.out.println(" " + maiorValor);

    }
    
}
