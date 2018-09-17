package oo.encapsulamento;

import java.util.Scanner;

public class ExecUsuario {
    public static void main(String[] args) {
        /*
        Usuario user = new Usuario(123, "Joyce", new String[10]);
        String novoAmigo = "Fulano";
        boolean adicionou = user.adicionaAmigo(novoAmigo);
        if(adicionou){
            System.out.println("Amigo adicionado com sucesso!!");
        }else{
            System.out.println("Problema ao adicionar amigo.");
        }
        
        novoAmigo = "Fulano";
        adicionou = user.adicionaAmigo(novoAmigo);
        if(adicionou){
            System.out.println("Amigo adicionado com sucesso!!");
        }else{
            System.out.println("Problema ao adicionar amigo.");
        }

*/
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade máxima de usuários: ");
        int qtde = in.nextInt();
        Usuario[] listaUsuarios = new Usuario[qtde];       
                
        for (int i = 0; i < listaUsuarios.length; i++) {
            System.out.println("Informe o código: ");
            int codigo = in.nextInt();
            System.out.println("Informe o nome: ");
            String nome = in.next();
            System.out.println("Informe a quantidade máxima de amigos: ");
            qtde = in.nextInt();
            
            String[] amigos = new String[qtde];
            for (int j = 0; j < qtde; j++) {
                System.out.println("Informe o nome do amigo:");
                String nomeAmigo = in.next();
                amigos[j] = nomeAmigo;
            }
            
            Usuario user = new 
                    Usuario(codigo, nome, amigos);
            
            listaUsuarios[i] = user;            
            
        }
        
        for (Usuario usuario : listaUsuarios) {
            System.out.println("+User: " + usuario);
            System.out.println("Amigos:");
            for (String amigo : usuario.getAmigos()) {
                System.out.println("->" + amigo);
            }
        }
        
    }  

    
    
}
