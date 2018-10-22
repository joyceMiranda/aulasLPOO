package oo.apigrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//estabelecer relacionamento de herança
public class TelaCalculadora extends JFrame {
    
    //declarar componentes da tela
    JPanel painel = new JPanel();
    JLabel lblNum1 = new JLabel("Valor 1:");
    JLabel lblNum2 = new JLabel("Valor 2:");
    JTextField txtNum1 = new JTextField();
    JTextField txtNum2 = new JTextField();
    JButton btnSomar = new JButton("Somar");
    JTextField txtResultado = new JTextField();
    
    //modificar o construtor
    public TelaCalculadora(){
        gerarInterface();
    }
    
    //metodo para organizar a interface
    public void gerarInterface(){
        
        //definir o tipo de layout
        GridLayout grid = new
            GridLayout(3, 2, 5, 5);
        painel.setLayout(grid);
        
        //adicionar componentes ao painel
        painel.add(lblNum1);
        painel.add(txtNum1);
        painel.add(lblNum2);
        painel.add(txtNum2);
        painel.add(btnSomar);
        painel.add(txtResultado);
        
        txtResultado.setEnabled(false);
        
        //adicionar o painel ao frame
        add(painel);
        
        //configurar apresentacao do frame
        setTitle("Calculadora");
        setBounds(5, 5, 300, 200);
        
        //define acao ao clicar no botao 'x' da janela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
               
        //add listener ao botao somar
        btnSomar.addActionListener(
                new SomarListener());
        
        
    }
    
    public static void main(String[] args) {
        //instaciar a tela
        TelaCalculadora telaCalculadora = 
                new TelaCalculadora();
        telaCalculadora.setVisible(true);
    }
    
    class SomarListener implements ActionListener{
        @Override
        public void actionPerformed(
                ActionEvent e) {
         try{
            if(!txtNum1.getText().equals("") && !txtNum2.getText().equals("")){
                //recuperando dados da tela
                double num1 = Double.parseDouble(
                        txtNum1.getText());
                double num2 = Double.parseDouble(
                        txtNum2.getText());

                //associando valores da tela
                //aos atributos da classe
                Calculadora calc = new Calculadora();
                calc.setNumero1(num1);
                calc.setNumero2(num2);

                //chamando o método da classe
                double resultado = calc.somar();

                //exibindo o resultado na tela
                txtResultado.setText(
                        Double.toString(resultado));
            }else{
                JOptionPane.showMessageDialog(
                    null, "Para prosseguir, informe todos os campos.");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(
                    null, "Informe apenas números.");
            
        }
         
        }        
        
    }
    
}
