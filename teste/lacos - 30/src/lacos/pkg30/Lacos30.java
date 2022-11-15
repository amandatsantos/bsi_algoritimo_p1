/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lacos.pkg30;


/**
 *
 * @author tavar
 */
public class Lacos30 {

    /**
     * @param args the command line arguments
     */
     public static int Primo(int n) {
        // TODO code application logic here
        int i, div =0;
        
        for ( i =1 ; i<=n; i++){
            if(n % i == 0)
                div++;
        }
        if (div == 2)
            return 1;
        else
            return 0;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
     
        int i;
        for (i =1; i <= 1000; i++){
        if (Primo(i) == 1){
        System.out.println(i);
        }
        }
    }
}
    
  
