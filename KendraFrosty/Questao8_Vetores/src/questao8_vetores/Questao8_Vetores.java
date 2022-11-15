
package questao8_vetores;
import javax.swing.JOptionPane;
public class Questao8_Vetores {


    public static void main(String[] args) {
        //8 - Ler dois vetores reais de 30 posições e um 3º vetor cujo conteúdo de cada posição é 1 vetor
        //é o mesmo armazenado na posição respectiva do 2º, e 0 caso contrário.
        
        double[] vetor1 = new double [30];
        double[] vetor2 = new double [30];
        double[] vetor3 = new double [30];
        
        for (int i=0;i<30;i++){
            vetor1[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número: "));
            vetor2[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um outro número: "));
            
            if (vetor1[i]==vetor2[i]){
                vetor3[i]=1; 
            }
            else{
                vetor3[i]=0;
            }
            JOptionPane.showMessageDialog(null,"Valor = " + vetor3[i]);
        }
    }
}
