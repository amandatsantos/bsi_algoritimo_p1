
package questao4_vetoress;
import javax.swing.JOptionPane;
public class Questao4_Vetoress {

    public static void main(String[] args) {
        
        double [] num = new double[30];
    
    for(int i=0;i<num.length;i++){
       
        num[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor:  ")); 
    }
       for(int i=4;i!=-1;i--){
          if((num[i]% 2)==1){
      JOptionPane.showMessageDialog(null,num[i]);
        }   
        else{
           
        }
    }
    }
    
}
