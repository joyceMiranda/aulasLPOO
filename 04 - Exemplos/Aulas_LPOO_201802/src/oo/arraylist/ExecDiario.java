package oo.arraylist;

public class ExecDiario {
    public static void main(String[] args) {
        
        Diario diario = new Diario(0,"LPOO", "Joyce", 40);
        
        Aluno aluno = new Aluno(0, "12345678", "Fulano");
        
        boolean incluiu = diario.incluirAluno(aluno);
        
        if(incluiu){
            System.out.println("Inclusão realizada!");
        }else{
            System.out.println("Inclusão NÃO realizada!");
        }
        
        diario.listarAlunos();
        
    }
    
}
