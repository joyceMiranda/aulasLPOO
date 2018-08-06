package sintaxeBasica;

public class VetorBusca {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        //preenchendo numeros aleatorios
        //entre 0 e 100
        for(int i=0; i < 10; i++){
            int numeroAleatorio = 
                    (int) (Math.random() * 100) + 1;
            vetor[i] = numeroAleatorio;
        }
        
        //imprimindo o conteudo do vetor
        for(int aux : vetor){
            System.out.println(" " + aux);
        }
        
        //busca no vetor
        boolean achei = false;
        for(int aux : vetor){
            if(aux == 100){
                achei = true;
                break;
            }
        }
        if(achei){
            System.out.println("Achei o 100!");
        }else{
            System.out.println("NÃO achei o 100!");
        }
    }
}
