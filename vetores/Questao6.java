
package com.mycompany.questao6;
import javax.swing.JOptionPane;
public class Questao6 {

    public static void main(String[] args) {
        
        int ano;
                String sAno;
                
                sAno = JOptionPane.showInputDialog(null,"Digite um ano");
                ano = Integer.parseInt(sAno);
                
                if ((ano%4==0) && (ano%100!=0))
                {
                    JOptionPane.showMessageDialog(null,"Bissesto");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Não é bissesto");
                }
 }    
}
