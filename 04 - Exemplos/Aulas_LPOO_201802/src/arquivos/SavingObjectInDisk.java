package arquivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SavingObjectInDisk {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("123456", "Fulano de Tal");
        try {
            //Gerando arquivo para armazenar objeto
            FileOutputStream file = 
                    new FileOutputStream("C:\\ObjetosJava\\alunos2.dat", true);
            //Classe responsavel por inserir o objeto
            ObjectOutputStream oos = new ObjectOutputStream(file);
            //gravando objeto no arquivo
            oos.writeObject(aluno);
            //limpando memória
            oos.close();
            file.close();
            System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
