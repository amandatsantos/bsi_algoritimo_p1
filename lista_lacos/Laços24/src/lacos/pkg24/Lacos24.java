/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lacos.pkg24;

import java.lang.invoke.VarHandle;

import javax.swing.JOptionPane;

public class Lacos24 {

    public static void main(String[] args) {
        // TODO code application logic here
        var pulo = "\n";
        int nome = 0, curso, ingre, sem, ano = 0, ingreV = 0, ingreT = 0, ingreE = 0;
        double percentualT = 0, percentualL = 0, percentualM = 0, percentualB = 0;
        double cursoL = 0, cursoM = 0, cursoB = 0, totalDeAlunosMatri = 0, CR = 0, CRM = 0, CRP = 0, CRR = 0, maior = 0,
                menor = 10;
        String curso1 = "", ingre1 = "", sem1 = "";

        // Curso
        for (int i = 0; i < 3; i++) {

            nome = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu numero: "));
            curso = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha seu curso:" + pulo + "1 - Letras" + pulo + "2 - Matematica" + pulo + "3 - Biologia"));
            ingre = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha sua forma de ingresso: " + pulo
                    + "1 - Vestibular" + pulo + "2 - Transferência" + pulo + "3 - ENEM"));
            sem = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o semestre que voçê entrou:" + pulo + " 1-1º semestre" + pulo + " 2-2º semestre"));
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ano ingresso?"));
            CR = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu CR (Coeficiente de Rendimento)?"));

            if (curso == 1) {
                curso1 = "letras";
                cursoL++;
                totalDeAlunosMatri++;

            } else if (curso == 2) {
                curso1 = "matematica";
                cursoM++;
                totalDeAlunosMatri++;
            } else if (curso == 3) {
                curso1 = "biologia";
                cursoB++;
                totalDeAlunosMatri++;

            } else if (curso > 3 || curso < 0) {
                curso1 = "  ";
            }
            // Forma de ingresso
            if (ingre == 1) {
                ingre1 = "vestibular";
                ingreV++;
            } else if (ingre == 2) {
                ingre1 = "transferência";
                ingreT++;
            } else if (ingre == 3) {
                ingre1 = "ENEM";
                ingreE++;
            } else if (ingre > 3 || ingre < 0) {
                ingre1 = "  ";
            }
            // Semetre
            if (sem == 1) {
                sem1 = "primeiro";
            } else if (sem == 2) {
                sem1 = "segundo";
            } else if (sem > 2 || sem < 0) {
                sem1 = "  ";
            }
            // CR+-
            if (CR > maior) {
                maior = CR;
            }
            if (CR < menor) {
                menor = CR;
            }
            // CR
            if (CR < 7.5) {
                CR = CR;
            }

            else if (CR >= 7.5) {
                CRP++;
                CR = CR;
            }

            CRM = (CRM + CR);
            percentualL = cursoL / totalDeAlunosMatri * 100;
            percentualM = cursoM / totalDeAlunosMatri * 100;
            percentualB = cursoB / totalDeAlunosMatri * 100;
            percentualT = percentualB + percentualL + percentualM;
        }

        JOptionPane.showMessageDialog(null,
                "Ultimo aluno cadastrado:" + pulo + "Aluno n° " + nome + ", do curso de " + curso1
                        + ", que entrou por " + ingre1 + " no " + sem1 + " semestre de " + ano
                        + "\nTotal de alunos no curso de Letras: " + cursoL + " (" + percentualL + "%)"
                        + "\nTotal de alunos no curso de Matemática: " + cursoM + " (" + percentualM + "%)"
                        + "\nTotal de alunos no curso de Biológia: " + cursoB + " (" + percentualB + "%)"
                        + "\nTotal de alunos Matriculados: " + totalDeAlunosMatri + " (" + percentualT + "%)"
                        + "\nQuantidade de alunos com CR superior a 7,5 neste ano: " + CRP
                        + "\nMenor CR neste ano: " + menor
                        + "\nMaior CR neste ano: " + maior
                        + "\nCR Médio dos alunos neste ano: " + CRM / totalDeAlunosMatri
                        + "\nQuantidade de alunos que ingressaram por:"
                        + "\nVestibular: " + ingreV + "\nTransferencia: " + ingreT + "\nENEM: " + ingreE);
    }
}
