
package questao6_vetores;

import javax.swing.JOptionPane;

public class Questao6_Vetores {

   public static void main(String[] args) {
      // 6 - Vetor real de 20 posições: as 10 primeiras são números informados pelo
      // usuário
      // e as 10 seguintes são os mesmos números na ordem inversa.
      double vetor[];
      vetor = new double[20];
      String var = "";

      for (int i = 0; i < 10; i++) {

         var = JOptionPane.showInputDialog(null, "Digite os numero");
         vetor[i] = Integer.parseInt(var);
      }
      for (int j = 9; j >= 0; j--) {

         JOptionPane.showMessageDialog(null, "Os numeros inversos são: " + vetor[j]);
      }
   }
}
