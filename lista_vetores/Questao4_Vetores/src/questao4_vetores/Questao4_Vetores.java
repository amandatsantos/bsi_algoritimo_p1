
package questao4_vetores;
import javax.swing.JOptionPane;
public class Questao4_Vetores {

 
    public static void main(String[] args) {
        //3.Ler 30 números reais em um vetor e depois exibir os números localizados nas posições impares.
         double vetor [];
        vetor = new double [30];
        String var ="";
       
         for (int i=0;i<30;i++){
            
            var = JOptionPane.showInputDialog(null,"Digite os numero");
            vetor[i] = Integer.parseInt(var);
      }
        for (int j=0;j<30;j++){
            if (vetor[j]%2!=0){
               JOptionPane.showMessageDialog(null,"Os numeros ímpares são: "+vetor[j]);
            }
       }
    }
}
