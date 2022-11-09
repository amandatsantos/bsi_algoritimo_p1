
package com.mycompany.questao4;
import javax.swing.JOptionPane;
public class Questao4 {

    public static void main(String[] args) {
        
        double valor, quadrado, cubo;
        String sValor;
                
        sValor = JOptionPane.showInputDialog(null,"Digite um valor");
        valor = Double.parseDouble(sValor);
        
        quadrado = valor*valor;
        cubo = valor*valor*valor;
        
        if (quadrado %2 == 0)
        {
           JOptionPane.showMessageDialog(null,"Quadrado par");
        }
        else{
          JOptionPane.showMessageDialog(null,"Cubo ímpar");
        }        
    }
}
