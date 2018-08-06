package sintaxebasica.joptionpane;

import javax.swing.JOptionPane;

public class IntervaloParesComJoptionpane {

    public static void main(String[] args) {
        
        int x= Integer.parseInt(
                JOptionPane.showInputDialog(null, 
                "Informe o valor de X"));        
        int y= Integer.parseInt(
                JOptionPane.showInputDialog(null, 
                "Informe o valor de Y"));        
        if(x >= y){
            JOptionPane.showMessageDialog(
                    null, "Erro! Informe x < y");
        }else{
             String msg = "Valores pares do Intervalo:\n"; 
            for(int i=x; i < y; i++){
                if( i%2 == 0 ){
                    msg =  msg + " " + i;
                }
            }
            JOptionPane.showMessageDialog(
                    null, msg);
        }
    }
    
}
