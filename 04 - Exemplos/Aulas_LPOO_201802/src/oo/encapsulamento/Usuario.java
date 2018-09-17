package oo.encapsulamento;

public class Usuario {
    
    private int codigo;
    private String nome;
    private String[] amigos;

    public Usuario() {
    }

    public Usuario(int codigo, String nome, String[] amigos) {
        this.codigo = codigo;
        this.nome = nome;
        this.amigos = amigos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String[] getAmigos() {
        return amigos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean possuiAmigo(String nome){
        for (int i = 0; i < amigos.length; i++) {
            if(amigos[i] != null && amigos[i].equals(nome)){
                return true;
            }            
        }
        return false;  
    }
    
    boolean adicionaAmigo(String nome){
        if(!possuiAmigo(nome)){
            for (int i = 0; i < amigos.length; i++) {
                if(amigos[i] == null  || amigos[i].equals("")){
                    amigos[i] = nome;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.codigo + "-" + this.nome ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
