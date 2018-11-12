package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable{
    
    private int codigo;
    private String nome;
    private double valor;

    public Produto(){}
    
    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    
     public boolean save(String file){
     try{
      List<Produto> listaProdutos = new ArrayList();
      File arq = new File(file);
      if(!arq.exists() || !arq.isFile()){
          listaProdutos.add(this); 
      }else{
          //carregando arquivo
          FileInputStream fis = new FileInputStream(arq);
          ObjectInputStream ois = new ObjectInputStream(fis);
          listaProdutos = (List<Produto>) ois.readObject();
          //atualiza a lista
          listaProdutos.add(this); 
          ois.close();
          fis.close();
      }
      
      FileOutputStream fos = new FileOutputStream(arq);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(listaProdutos);

      return true;         
     
     }catch(Exception ex){
      System.out.println("Erro:"+ex.getMessage());
      return false;
     }
    }
    
    public List<Produto> show(String file){
       try {
        List<Produto> listaProdutos = new ArrayList();
        File arq = new File(file);
        if(!arq.exists() && !arq.isFile()){
          return null;    
        }else{
            FileInputStream fis = new FileInputStream(arq);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaProdutos = (List<Produto>) ois.readObject();
            ois.close();
            fis.close();
        }
        return listaProdutos; 
       }catch (IOException | ClassNotFoundException ex) {
         System.out.println("Erro:"+ex.getMessage());
         return null;
       } 
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", valor=" + valor + '}';
    }
    
}
