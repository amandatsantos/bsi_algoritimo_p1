package questao9_vetores;

public class Questao9_Vetores {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("\n primeiro for vai multiplicar o elementos do array por 10  ");
        for (int i = 0; i < 9; i++) {
            a[i] = 10 * i;
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();
        System.out.println("\n segundo for vai somar o elementos do array mais 1");

        for (int i = 0; i < 8; i++) {
            a[i] = a[i] + 1;
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();
        System.out.println("\n terceiro for  vai imprimir os elementos do array ");

        for (int i = 0; i < 9; i++) {

            System.out.print("[" + a[i] + "]");
        }

    }
}
