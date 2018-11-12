package arquivos;

import java.util.List;

public class ExecProduto {
    public static void main(String[] args) {
        String arq = "C:\\ObjetosJava\\listaProdutos.dat";

        Produto prod1 = new Produto(0, "Televisão", 1500.00);
        prod1.save(arq);
        
        Produto prod2 = new Produto(1, "Notebook", 50000.00);
        prod2.save(arq);
        
        Produto prod = new Produto();
        List<Produto> listaProdutos = prod.show(arq);
        for (Produto produto : listaProdutos) {
            System.out.println("**" + produto);
        }
    }
}
