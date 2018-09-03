package oo.metodos;

public class Pessoa {
    
    public long cpf;
    public String nome;
    public int anoNascimento;
      
    public Pessoa(long cpf, String nome, int anoNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    
    public int calcularIdade(int anoAtual){
        return anoAtual - this.anoNascimento;
    }
    
}
