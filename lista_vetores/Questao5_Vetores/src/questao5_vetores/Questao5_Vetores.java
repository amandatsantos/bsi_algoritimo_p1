
package questao5_vetores;
import javax.swing.JOptionPane;
public class Questao5_Vetores {

    public static void main(String[] args) {
        //Ler 50 valores reais e armazenar em um vetor. Modifique o vetor de modo que
        //os valores das posições impares sejam aumentados em 5%, e os das 
        //posições pares sejam aumentados em 2%. Imprima depois o vetor resultante.
        
        double [] vetor = new double [50];
        
         for (int i=0;i<vetor.length;i++){
            vetor[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor: "));
      }
        for (int i=0;i<50;i++){
            if (vetor[i]%2==1){
                vetor[i] = vetor[i]*1.05;
               JOptionPane.showMessageDialog(null,"Os numeros ímpares são: "+vetor[i]); 
            }
            else {
                vetor [i] = vetor [i]*1.02;
                JOptionPane.showMessageDialog(null,"Os numeros pares são: "+ vetor[i]);
            }
        }
    }
}
            