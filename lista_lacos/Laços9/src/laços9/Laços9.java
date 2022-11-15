
package laços9;
import javax.swing.JOptionPane;
public class Laços9 {


    public static void main(String[] args) {
        
        long casas;
        int valor;
        String val;
        int contador = 0;

        casas = 1;
        val = JOptionPane.showInputDialog(null, "Digite um valor");
        valor = Integer.parseInt(val);

        if (valor > 63) {
            JOptionPane.showMessageDialog(null, "2^" + valor);
        } else {

            do {
                casas = casas * 2;
                contador++;
            } while (contador < valor);

            JOptionPane.showMessageDialog(null, casas);
        }
    }
    
}
