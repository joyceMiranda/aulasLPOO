package oo.metodos;

import java.util.Calendar;

public class ExecPessoa {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa(1233456, "Fulano", 2000);
        
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR); 
        
        System.out.println("A idade de " + p.nome + 
                " é " + p.calcularIdade(anoAtual));
        
    }
    
}
