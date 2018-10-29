package interfaceGrafica;

public class Curso {
    private int codigo;
    private String descricao;

    public Curso(String descricao) {
        this.descricao = descricao;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean cadastrar(){
        this.codigo = geraCodigo();
        return true;
    }
    
    private int geraCodigo(){
        return this.hashCode();
    }
    
}
