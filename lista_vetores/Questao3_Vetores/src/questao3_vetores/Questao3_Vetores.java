
package questao3_vetores;

import javax.swing.JOptionPane;

public class Questao3_Vetores {

    public static void main(String[] args) {
        // Modifique a questão 2, de modo que haja dois vetores, a ... invertido.
        // Impirma os valores lado a lado no seguinte formato.
        int vetor1[];
        int vetor2[];
        vetor1 = new int[20];
        String var1 = "";

        for (int i = 0; i < 20; i++) {
            var1 = JOptionPane.showInputDialog(null, "Digite os numero");
            vetor1[i] = Integer.parseInt(var1);
        }
        for (int j = 19; j >= 0; j--) {
            JOptionPane.showMessageDialog(null, "Valor = " + vetor1[j]);
        }
    }

}
