package oo.arraylist;

import java.util.ArrayList;
import java.util.List;
import oo.encapsulamento.Usuario;

public class ListaUsuarios {

    public static void main(String[] args) {
        
        List<Usuario> listaUsuarios = 
                new ArrayList<>();
        
        listaUsuarios.add(new Usuario(0, "Joyce", new String[2]));
        listaUsuarios.add(new Usuario(0, "Fulano", new String[2]));
        
        System.out.println(
                "Qtde de usuarios: " + listaUsuarios.size() );
        
        for (Usuario usuario : listaUsuarios) {
            System.out.println("->" + usuario.getNome());
        }
        
    }
    
}
