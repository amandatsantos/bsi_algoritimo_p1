
package com.mycompany.questao9;
import javax.swing.JOptionPane;
 class Questao9 {

    public static void main(String[] args) {
        
        int idade, idade_faltan;
        
        String sIdade;
        
        sIdade = JOptionPane.showInputDialog(null,"Digite sua idade");
        idade = Integer.parseInt(sIdade);
        idade_faltan = idade - 18;
        if (idade>=18)
        {
            //Não sei como fqaz pra saber o retante dos anos q a pessoa falta pra completar os 18 anos
          idade=18-idade_faltan;       
            JOptionPane.showMessageDialog(null,"Maior de idade");}
        else{
            JOptionPane.showMessageDialog(null,"Você é menor de idade ainda falta " +sIdade+ " anos para ser maior idade");
        }
    }
}
