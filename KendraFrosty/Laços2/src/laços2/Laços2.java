package laços2;
import javax.swing.JOptionPane;
public class Laços2 {

  
    public static void main(String[] args) {
        
      int pop, num_filhos=0, i, y=1, total_filhos=0;
        
        double salario, total_sala=0, media_salario, media_filhos, perc_salario=0, maior_salario=0;
        String sSalario,snum_filhos, spop;
        
        spop = JOptionPane.showInputDialog(null,"Digite a quantidade de habitantes da cidade: ");
        pop = Integer.parseInt(spop);
        
         for(i=1;i<=pop;i++){
             
        sSalario = JOptionPane.showInputDialog(null,"Digite seu salario: R$ ");
        salario = Double.parseDouble(sSalario);
        
        snum_filhos = JOptionPane.showInputDialog(null,"Digite a quatidade de filhos");
        num_filhos = Integer.parseInt(snum_filhos);

     // Soma dos salarios

         total_sala = salario + total_sala;

     // Soma dos filhos

         total_filhos = total_filhos + num_filhos;

     // Maior salario

           if(maior_salario < salario){

            maior_salario = salario;

       }

     // Percentagem até R$ 200,00

            if(salario <= 200){
            perc_salario = (y * 200) / pop;
               y++;   
          }
     }

     // Media dos salarios

     media_salario = total_sala / pop;

    // Media dos filhos

     media_filhos = total_filhos / pop;

     JOptionPane.showMessageDialog (null, "\nA media do salario da populacao é R$ "+ media_salario);

     JOptionPane.showMessageDialog (null, "\nA media do numero dos filhos é "+ media_filhos);

     JOptionPane.showMessageDialog (null, "\nO maior salario é R$ "+ maior_salario);

     JOptionPane.showMessageDialog (null, "\nA percentagem das pessoas com salarios ate R$ 200,00 é "+perc_salario);

    }
    
}
