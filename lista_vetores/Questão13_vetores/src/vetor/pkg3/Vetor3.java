/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor.pkg3;

/**
 *
 * @author tavar
 */
import java.lang.System;

public class Vetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] a = { 2, 3, 4, 5 };
         System.out.println("Agora a ordem original");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Agora a ordem invertida");
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }
    
}
