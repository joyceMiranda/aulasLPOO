package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SavingAndReadingObjectList {
    
    public static void main(String[] args) {
        
        String continua = "S";
        List<Aluno> listaAlunos_Atual = new ArrayList();
        List<Aluno> listaAlunos_Nova = new ArrayList();

      
        try { 
            File file = new File("C:\\ObjetosJava\\listaAlunos.dat");
            
             if(file.exists()){
                
                //exibindo lista atual de alunos
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                listaAlunos_Atual = (List<Aluno>) ois.readObject();  
                
                for (Aluno aluno : listaAlunos_Atual) {
                    System.out.println(aluno);
                }
               
            }
             
            do{
               continua =
                 JOptionPane.showInputDialog("Deseja cadastrar um novo aluno (S) ou (N)");
               if(continua.equalsIgnoreCase("N")){
                   break;
               }
               String matricula = 
                       JOptionPane.showInputDialog("Matrícula:");
               String nome = 
                       JOptionPane.showInputDialog("Nome:");

               Aluno aluno = new Aluno(matricula, nome);
               listaAlunos_Nova.add(aluno);
               
           }while(continua.equalsIgnoreCase("S"));
            
            //salvando
            listaAlunos_Atual.addAll(listaAlunos_Nova);

            FileOutputStream fos =
                    new FileOutputStream("C:\\ObjetosJava\\listaAlunos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaAlunos_Atual);

               
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    
}
