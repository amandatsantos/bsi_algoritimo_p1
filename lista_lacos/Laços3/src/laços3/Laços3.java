
package laços3;
import javax.swing.JOptionPane;
public class Laços3 {

    public static void main(String[] args) {
        
     int lista1 = 0;
     int lista2 = 0;
     int lista3 = 0;
     int lista4 = 0;
     int quantidadeForaDoIntervalo = 0;
     
     int n=0;
     
     while (n != (-1)) {
         System.out.println("Informe um numero");
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
     }
    
      if ((n<=0)||(n<=25)){
          quantidadeForaDoIntervalo = quantidadeForaDoIntervalo + 1;
    }
      else if ((n>=0)&&(n<=25)){
          lista1 = lista1 + 1;          
      }
      else if ((n>= 26) && (n <= 50)) {
          lista2 = lista2 + 1;   
                  
      }
      else if ((n >= 51) && (n <= 75)) {
         lista3 = lista3 + 1;   
      }
      else if ((n>= 76) && (n <= 100)) {
          lista4 = lista4 + 1;
    }
        System.out.println("Quantidade de números no intervalo de 0 a 25, é de " + lista1);
        System.out.println("Quantidade de números no intervalo de 25 a 50, é de " + lista2);
        System.out.println("Quantidade de números no intervalo de 50 a 75, é de " + lista3);
        System.out.println("Quantidade de números no intervalo de 75 a 100, é de " + lista4);
        System.out.println("Quantidade de números fora do intervalo, é de" + quantidadeForaDoIntervalo);
    } 
}
