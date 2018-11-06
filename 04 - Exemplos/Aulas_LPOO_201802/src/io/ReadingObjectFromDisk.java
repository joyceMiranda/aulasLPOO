package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingObjectFromDisk {
    public static void main(String[] args) {
         try {
            //Carregando arquivo
            FileInputStream file = 
                    new FileInputStream("C:\\ObjetosJava\\alunos2.dat");
            while (file.available() > 0){
                //Classe responsavel por recuperar o objeto
                ObjectInputStream ois = new ObjectInputStream(file);
                Aluno aluno = (Aluno) ois.readObject();  
                System.out.println(aluno);
            }  
            file.close();
            System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
