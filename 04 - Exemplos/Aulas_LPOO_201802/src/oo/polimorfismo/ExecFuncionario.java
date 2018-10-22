package oo.polimorfismo;

public class ExecFuncionario {
  public static void main(String[] args) {
        
    Funcionario g = 
    new Gerente("Fulano", 1000.00, "gerente", 500.00, "GEAS");
    g.pagarSalario(g, 10);
    
    Funcionario p = 
    new Professor("Ciclano", 1000.00, "professor", "Informatica", 1);
    p.pagarSalario(p, 10);
    
   
  }
}
