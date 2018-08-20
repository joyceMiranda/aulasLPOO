package oo;

import javax.swing.JOptionPane;

public class ExecRetangulo {

    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        
        ret.base = Double.parseDouble(
                    JOptionPane.showInputDialog
                    ("Informe a base:"));
        
        ret.altura = Double.parseDouble(
                    JOptionPane.showInputDialog
                    ("Informe a altura:"));
        
        double area = ret.base * ret.altura;
        
        JOptionPane.showMessageDialog(null, 
                "Base = " + ret.base + "\n" +
                "Altura = " + ret.altura + "\n" + 
                "Área = " + area);
        
        
        
        
    }
    
}
