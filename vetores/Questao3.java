
package com.mycompany.questao3;
import javax.swing.JOptionPane;
public class Questao3 {

    public static void main(String[] args) {
       
        int dia, idade, preço, ingresso_terça;
        String sDia, sIdade, sPreço;
        
        sDia = JOptionPane.showInputDialog(null,"Digite 1 para Domingo, 2 para Segunda, 3 para Terça, 4 para Quarta, 5 para Quinta, 6 para Sexta e 7 para Sabado");
        sIdade = JOptionPane.showInputDialog(null,"Digite sua idade");
        sPreço = JOptionPane.showInputDialog(null,"Digite o preço do ingresso");
        
        dia = Integer.parseInt(sDia);
        idade = Integer.parseInt(sIdade);
        preço = Integer.parseInt(sPreço);
        //A inda falta descobir como vou escrever esse preço pra ser descontado
        if (idade<=14)
        {
            preço = ingresso_terça*0.5;
            JOptionPane.showMessageDialog(null,"Desconto de 50%");
        }
        }
    }   
    
}
