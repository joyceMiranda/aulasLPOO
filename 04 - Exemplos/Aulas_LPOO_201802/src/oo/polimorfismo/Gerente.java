package oo.polimorfismo;

public class Gerente extends Funcionario {
    
    private double bonus;
    private String setor;

    public Gerente(String nome, double salarioBruto, String funcao, 
            double bonus, String setor) {
        super(nome, salarioBruto, funcao);
        this.bonus = bonus;
        this.setor = setor;
    }

    @Override
    public double calcSalarioLiquido(double percentalDesconto) {
        return super.calcSalarioLiquido(percentalDesconto) + 
               this.bonus; 
    }

   
    
    
}
