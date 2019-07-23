package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable{
    private int codigo;
    private String nome;
    private double valor;

    public Produto() {}

    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + '}';
    }
    
    public boolean save(String arq){
        try {
            //recuperando..
            List<Produto> listaProdutos = this.show(arq);
            listaProdutos.add(this);            
            //salvando...
            FileOutputStream fos = new FileOutputStream(arq);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaProdutos);            
            return true;
         } catch (Exception ex) {
                System.out.println("erro save: " + ex.toString());
                return false;
         }
    }
    
    public List<Produto> show(String arq){
        try{
           File file = new File(arq);
           List<Produto> listaProdutos = new ArrayList();
           if(file.exists()){
            //recuperando lista do disco
            //para atualizacao...
            FileInputStream fis = new
                FileInputStream(file);
            ObjectInputStream ois =
                new ObjectInputStream(fis);
            listaProdutos = (List<Produto>) ois.readObject();
           }
           return listaProdutos;
        }catch(Exception ex){
            System.out.println("erro show: " + ex.toString());
            return null;
        }
    }
    
    
    
    
    
    
}
