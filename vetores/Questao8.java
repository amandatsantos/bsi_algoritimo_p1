
package com.mycompany.questao8;
import javax.swing.JOptionPane;
public class Questao8 {

    public static void main(String[] args) {
       
        double pontox, pontoy;
        String spontox, spontoy;
        
        spontox = JOptionPane.showInputDialog(null,"Digite um valor pro ponto x da parabola");
        spontoy = JOptionPane.showInputDialog(null,"Digite um valor pro ponto y da parabola");
        pontox = Double.parseDouble(spontox);
        pontoy = Double.parseDouble(spontoy);
        
        if (pontoy<pontox*pontox-3*pontox+1)
        {
            JOptionPane.showMessageDialog(null,"Abaixo");
        }
        else if (pontoy>pontox*pontox*pontox-3*pontox+1){
            JOptionPane.showMessageDialog(null,"Acima");
        }
        else{
            JOptionPane.showMessageDialog(null,"pertece a parabola");
        }
        
    }
}
