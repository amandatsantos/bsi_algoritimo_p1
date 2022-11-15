/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lacos.pkg21;

/**
 *
 * @author tavar
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tavar
 */
public class Lacos21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // frase de entrada
        String mostrar = "";
        int vog = 0, con = 0;
        char cont, c;
        String ref = "qwer";
        String entrada = "teste !";
        String asciiValue = "teste";
        // contando o tamanho da frase de entrada 1-
        int caracter1 = entrada.length();
        JOptionPane.showMessageDialog(null, "-> " + entrada + "\nEssa frase contém " + caracter1 + " caracter.");
        // contando a quantidade sem contar espaços da frase de entrada 1-
        int caracter2 = entrada.replace(" ", "").length();
        JOptionPane.showMessageDialog(null, "E contém " + caracter2 + " sem contar os espaços.");

        int totalCaracter = 0;
        char letra;
        for (int i = 0; i < entrada.length(); i++) {

            letra = entrada.charAt(i);
            if (letra == 'a' || letra == 'z')
                totalCaracter++;
        }
        JOptionPane.showMessageDialog(null,
                "Na frase ( " + entrada + " ) as letras (a) e (z) aparacem " + totalCaracter + " vezes");

        // verificação de concoenates e vogais

        for (int i = 0; i < entrada.length(); i++) {

            if ((entrada.charAt(i) >= 'A'
                    && entrada.charAt(i) <= 'Z')
                    || (entrada.charAt(i) >= 'a'
                            && entrada.charAt(i) <= 'z')) {
                if (ref.indexOf(entrada.charAt(i)) != -1)
                    vog++;
                else
                    con++;
            }
        }
        JOptionPane.showMessageDialog(null, "vogoais = " + vog + "\nconsoantes= " + con);

        // exclamação
        for (int i = 0; i < entrada.length(); i++) {

            cont = entrada.charAt(i);
            if (cont == '!')
                totalCaracter++;

        }

        // valor na tabela asscic
        JOptionPane.showMessageDialog(null, mostrar);

        String stringValue = entrada;
        List<Integer> listOfIntegers = stringValue.chars()
                .boxed()
                .collect(Collectors.toList());

        for (int i : listOfIntegers) {

            JOptionPane.showMessageDialog(null, "valor de cada letra respectivmante" + "  " + i);
        }

    }
}
