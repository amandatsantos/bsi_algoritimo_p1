
package questão10_vetores;
import javax.swing.JOptionPane;
public class Questão10_Vetores {

   
    public static void main(String[] args) {
        // 10 - Vetor de 100 elementos, cada dado é a letra "P" ou "I", dependendo
        // de sua posição ser par ou ímpar. Imprima depois o vetor.
        int [] num = new int[100];
        String []num2= new String [100];
  
        for(int i=0; i<100;i++){
            num[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número "));
            
           if(num[i]%2==0){
               num2[i]="p";
           }
           else{
                if(num[i]%2==1)
                    num2[i]="i";
           }
            JOptionPane.showMessageDialog(null,"O vetor é: " + num2[i]);
        }
    }
}
