
package laços7;
import javax.swing.JOptionPane;
public class Laços7 {

    
    public static void main(String[] args) {
        
         double cels, fahr,kelvin; 
         
       cels=Double.parseDouble(JOptionPane.showInputDialog(null,"Temperatura em Celsius: "));
      
       fahr=(cels*9/5)+32;
      
       kelvin=cels+273.15;
       
       JOptionPane.showMessageDialog(null, "Celsius: "+cels+"\nFahreinheit: "+fahr+"\nKelvin: "+kelvin);
    }
    
}
