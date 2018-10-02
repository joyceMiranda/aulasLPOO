package oo.arraylist;

import java.util.Objects;

public class Aluno {
    
    private int codigo;
    private String matricula;
    private String nome;
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Aluno(int codigo, String matricula, String nome){
        this.codigo = codigo;
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println(
                " Matrícula: " + this.matricula 
              + " Nome: " + this.nome);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.nome);
    }    

   
}
