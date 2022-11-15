
package questao7_vetores;
import javax.swing.JOptionPane;
public class Questao7_Vetores {

    public static void main(String[] args) {
        
        int[] vetor1 = new int [30];
        int[] vetor2 = new int [30];
        int[] vetor3 = new int [30];
       
        for (int i=0;i<vetor1.length;i++){
               vetor1 [i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor: "));
               vetor2 [i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro valor"));
               vetor3[i] = vetor1[i]+vetor2[i];
            JOptionPane.showMessageDialog(null," O vetor " +vetor1[i] + "+" +vetor2[i]+" = " +vetor3[i]);
            
        }
    }
    
}
