package questao1_vetor;
import javax.swing.JOptionPane;
public class Questao1_Vetor {

    public static void main(String[] args) {
       
        //Faça um algoritmo para gerar um vetor de 30 posições, onde cada elemento corresponde ao quadrado de sua posição. Imprima depois o vetor resultante.
        
            int num[] = new int [30];
            int quadrado=0, valor_res;
            
             for (int i=0;i<30;i++){

           num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os numeros"));   
           quadrado = num[i]*num[i];
           
            JOptionPane.showMessageDialog(null,quadrado);     
    }             
             valor_res =  quadrado*quadrado;
           JOptionPane.showMessageDialog(null,valor_res);
     
   }  
}

