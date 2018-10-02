package oo.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Diario {
    
    private int codigo;
    private String disciplina;
    private String professor;
    private int qtdeMaximaAlunos;
    private List<Aluno> alunos;

    public Diario(int codigo, String disciplina, 
                  String professor, int qtdeMaximaAlunos) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
        this.alunos = new ArrayList<>();
    }
    
    public boolean contem(Aluno aluno){
        return alunos.contains(aluno);
    }
    
    public boolean incluirAluno(Aluno aluno){
        if(!this.contem(aluno)){
            if(alunos.size() <= this.qtdeMaximaAlunos){
                alunos.add(aluno);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }        
    }
    
    public int getTotalAlunosMatriculados(){
        return alunos.size();
    }
    
    public void listarAlunos(){
        System.out.println("Lista de Alunos do Diário:");
        for (Aluno aluno : alunos) {
            aluno.imprimir();
        }
    }
    
    
    
}
