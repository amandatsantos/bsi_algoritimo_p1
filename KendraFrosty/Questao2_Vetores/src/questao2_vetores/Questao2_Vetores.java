
package questao2_vetores;
import javax.swing.JOptionPane;
public class Questao2_Vetores {

   
    public static void main(String[] args) {
        //2. Ler 20 números inteiros e depois imprimi-los em ordem inversa.
        
        int vetor [];
        vetor = new int [20];
        String var ="";
        
        for (int i=0;i<20;i++){
            var = JOptionPane.showInputDialog(null,"Digite os numero");
            vetor[i] = Integer.parseInt(var);
        }
        for (int j=19;j>=0;j--){
            JOptionPane.showMessageDialog(null,"Valor = " + vetor[j]);
        }
    }  
}
