package oo.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {

    public static void main(String[] args) {
        //criando
        List<Integer> listaNumeros = new ArrayList();
        //adicionando
        listaNumeros.add(100);
        listaNumeros.add(1000);
        //rettornando tamanho da lista
        System.out.println(
                "Qtde de numeros: " + listaNumeros.size() );
        int count = 0;
        //listando todos os numeros
        for (Integer numero : listaNumeros) {
            System.out.println("-" + numero);
            count = count + numero;
        }
        //exibindo soma total dos numeros
        System.out.println("Soma total: " + count);
        
    }
    
}
