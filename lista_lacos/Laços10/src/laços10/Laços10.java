
package laços10;
import javax.swing.JOptionPane;
public class Laços10 {

    public static void main(String[] args) {
        
       int num;
        int cont=0;

        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número "));
       
        for(int i=num; i>0;i++){
            
            if(num%i==0){
          cont++;
            }
        }
        if(cont==2){
          JOptionPane.showMessageDialog(null," É primo ");
        }
        else{
            JOptionPane.showMessageDialog(null," Não é primo: ");
        }  
         
  }
    }
