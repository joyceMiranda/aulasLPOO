package arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {
    
    private String matricula;
    private String nome;
    
    public Aluno(){}

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + '}';
    }
    
    public boolean save(String file){
     try{
      FileOutputStream fos = new FileOutputStream(file, true);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(this);
      return true;
     }catch(IOException ex){
      System.out.println("Erro:"+ex.getMessage());
      return false;
     }
    }
    
    public List<Aluno> show(String file){
       try {
        FileInputStream fis = new FileInputStream(file);
        List<Aluno> listaAlunos = new ArrayList();
        while(fis.available() > 0){
          ObjectInputStream ois = new ObjectInputStream(fis);
          listaAlunos.add((Aluno) ois.readObject());
        }
        return listaAlunos;    
       } catch (IOException | ClassNotFoundException ex) {
         System.out.println("Erro:"+ex.getMessage());
         return null;
       } 
    }

    
    
    
}
