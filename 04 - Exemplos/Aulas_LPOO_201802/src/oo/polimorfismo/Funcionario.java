package oo.polimorfismo;

public class Funcionario {
    protected String nome;
    protected double salarioBruto;
    protected String funcao;

    public Funcionario(String nome, double salarioBruto, String funcao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public double calcSalarioLiquido(double percentalDesconto){
        return (this.salarioBruto - 
                (this.salarioBruto * percentalDesconto * 0.01));
    }
    
    public void pagarSalario(Funcionario funcionario, 
                             double percentualDesconto){
        System.out.println("Depositando: " + 
                this.calcSalarioLiquido(percentualDesconto) + 
                " na conta de " + this.nome);
    }
    
    
    
    
}
