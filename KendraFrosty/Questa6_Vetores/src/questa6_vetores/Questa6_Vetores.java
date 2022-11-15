
package questa6_vetores;
import javax.swing.JOptionPane;
public class Questa6_Vetores {

    public static void main(String[] args) {
        
        double[] valor = new double[20];
        int num=0;
    
    for(int i=0; i<10; i++){
        valor[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os numeros: "));
    }
    for(int i=19;i>9;i--){
       
       valor[i]=valor[num];
        num++;   
    }
    for(int i=0;i<=19;i++){
        JOptionPane.showMessageDialog(null,"Os valores são: " + valor[i]);
        
    }
    }  
}
