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
import java.util.Scanner;

public class Vetor3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int tam;

        System.out.print("Digite um tamanho para o array : ");
        tam = scanner.nextInt();

        int[] vet = new int[tam];
        // faz um looping pra capturar cada lugar do tamnho do array setado
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vet[i] = scanner.nextInt();
        }

        // Imprime vetor n ordem normal
        System.out.println("Vetor: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "] ");
        }

        System.out.println();

        vet = inverterVetor(vet);

        // Imprime vetor invertido6
        System.out.println();
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "] ");
        }
    }

    // método que faz a inverção
    public static int[] inverterVetor(int vet[]) {
        int temp;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;

            }
        }
        return vet;
    }
}
