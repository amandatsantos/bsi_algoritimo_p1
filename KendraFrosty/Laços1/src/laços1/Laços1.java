
package laços1;
import javax.swing.JOptionPane;
public class Laços1 {

 
    public static void main(String[] args) {
        
       String letra;
        int a = 0, z = 0, e = 0, il = 0, o = 0, u = 0, totalDeCaractere = 0, cons = 0,x=0;//x é de exclamação.
        char maiorLetra;

        //Capturar a palvra.
        letra = JOptionPane.showInputDialog(null, "Digite uma palavra: ");
       //Essa variavel aqui, é para capturar a maior letra inserida, maior de acordo com o alfabeto.
        maiorLetra = letra.charAt(0);
        //a) Achar a quantidade de letras('A' e 'Z' na palavra.
        for (int i = 0; i < letra.length(); i++) {
            //Quantidade de letra A
            if (letra.charAt(i) == 'a' || letra.charAt(i) == 'A') {
                a++;
            }//Quantidade de letra Z
            if (letra.charAt(i) == 'z' || letra.charAt(i) == 'Z') {
                z++;
            }//Teste
            if (letra.charAt(i) == 'e' || letra.charAt(i) == 'E') {
                e++;
            }
            if (letra.charAt(i) == 'i' || letra.charAt(i) == 'I') {
                il++;
            }
            if (letra.charAt(i) == 'o' || letra.charAt(i) == 'O') {
                o++;
            }
            if (letra.charAt(i) == 'u' || letra.charAt(i) == 'U') {
                u++;
            } else { //c)Quantidade de consoantes.
                if (letra.charAt(i) == 'b' || letra.charAt(i) == 'B') {
                    cons++;
                }
                if (letra.charAt(i) == 'c' || letra.charAt(i) == 'C') {
                    cons++;
                }
                if (letra.charAt(i) == 'd' || letra.charAt(i) == 'D') {
                    cons++;
                }
                if (letra.charAt(i) == 'f' || letra.charAt(i) == 'F') {
                    cons++;
                }
                if (letra.charAt(i) == 'g' || letra.charAt(i) == 'G') {
                    cons++;
                }
                if (letra.charAt(i) == 'j' || letra.charAt(i) == 'J') {
                    cons++;
                }
                if (letra.charAt(i) == 'k' || letra.charAt(i) == 'K') {
                    cons++;
                }
                if (letra.charAt(i) == 'l' || letra.charAt(i) == 'L') {
                    cons++;
                }
                if (letra.charAt(i) == 'm' || letra.charAt(i) == 'M') {
                    cons++;
                }
                if (letra.charAt(i) == 'n' || letra.charAt(i) == 'N') {
                    cons++;
                }
                if (letra.charAt(i) == 'p' || letra.charAt(i) == 'P') {
                    cons++;
                }
                if (letra.charAt(i) == 'r' || letra.charAt(i) == 'R') {
                    cons++;
                }
                if (letra.charAt(i) == 's' || letra.charAt(i) == 'S') {
                    cons++;
                }
                if (letra.charAt(i) == 't' || letra.charAt(i) == 'T') {
                    cons++;
                }
                if (letra.charAt(i) == 'v' || letra.charAt(i) == 'V') {
                    cons++;
                }
                if (letra.charAt(i) == 'w' || letra.charAt(i) == 'W') {
                    cons++;
                }
                if (letra.charAt(i) == 'x' || letra.charAt(i) == 'X') {
                    cons++;
                }
                if (letra.charAt(i) == 'z' || letra.charAt(i) == 'Z') {
                    cons++;
                }
            }
        }
        //b) A quantidade de caracteres informados.
        for (int i = 0; i < letra.length(); i++) {
            totalDeCaractere++;
        }//Quantidade de pontos de exclamação,condiçao de parada.
         for (int i = 0; i < letra.length(); i++){
             if (letra.charAt(i) == '!') {
                    x++;//exclamação
         }else{// Condiçao de parada
                 if (letra.charAt(i) == '#') {
                  
                    break;
                 }
                 
             }
        }

        //d) TESTAR QUAL A MAIOR LETRA DENTRO DESTA VARIAVEL
        for (int i = 0; i < letra.length(); i++) {
            if (letra.charAt(i) < maiorLetra) {
                maiorLetra = letra.charAt(i);
            }
        }
        //A Quantidade de pontos de exclamação informados
        
        
        JOptionPane.showMessageDialog(null, "1.Quantidade de Letras A = " + a + "\n2.Quantidade de Letra Z = " + z
                + "\n3.A Quantidade de Caracteres Informados = "
                + totalDeCaractere
                + "\n4.Consoantes = " + cons + "\n5.Maior Letra = " + maiorLetra+"\n6.Pontos de Exclamação = "+x);

    }
       }          
   
    
 