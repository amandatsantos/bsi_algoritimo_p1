/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursao;

import java.util.Scanner;

/**
 *
 * @author tavar
 */
public class Recursao {

    /**
     * @param n
     * @return
     */
    public static int fatorial(int n) {
        // TODO code application logic here
        if (n > 0) {
            return n * Recursao.fatorial(n - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.print("insira um valor para o calculo da sua fatorial:");
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        System.out.println(" o fatoral de " + valor + " é" + Recursao.fatorial(valor));
        scan.close();

    }

}