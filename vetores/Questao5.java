
package com.mycompany.questao5;
import javax.swing.JOptionPane;
public class Questao5 {

    public static void main(String[] args) {
        
       double distancia_Km, combust_Litros, Km_Lt ;
       String sDistancia_Km, sCombust_Litros;
       
         sDistancia_Km = JOptionPane.showInputDialog(null,"Digite a distância percorrida");
         sCombust_Litros = JOptionPane.showInputDialog(null,"Digite a quantidade de combustivel");
               
         distancia_Km = Double.parseDouble(sDistancia_Km);
         combust_Litros = Double.parseDouble(sCombust_Litros);
         
         Km_Lt = distancia_Km / combust_Litros;
           if (Km_Lt >= 15) 
           {
              JOptionPane.showMessageDialog(null,"Econômico");
           }
           else{
               JOptionPane.showMessageDialog(null,"Não é econômico");       
           }       
    }
}
