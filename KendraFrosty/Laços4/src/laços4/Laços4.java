package laços4;
import javax.swing.JOptionPane;
public class Laços4 {

    public static void main(String[] args) {
        
        int alunos, num, curso, ingre, st, ano;
        String snum,scurso, singre,sst,sano;
        
        snum = JOptionPane.showInputDialog(null,"Digite seu numero: ");
        scurso = JOptionPane.showInputDialog(null,"Escolha seu curso: 1 - letras, 2 - Transferência, 3 - Biologia");
        singre = JOptionPane.showInputDialog(null,"Escolha sua forma de ingresso: 1 - Vestibular, 2 - Transferência, 3 - ENEM");
        sst = JOptionPane.showInputDialog(null,"Digite o semestre que voçê entrou: 1-1º semestre, 2-2º semestre");
        sano = JOptionPane.showInputDialog(null,"Qual o ano ingresso?");
        
        num = Integer.parseInt(snum);
        curso = Integer.parseInt(scurso);
        st = Integer.parseInt(singre);
        ano = Integer.parseInt(sano);
        ingre = Integer.parseInt(singre);
        
        for (int i=0;i>4;i++){
            
            if (curso==1){
            JOptionPane.showMessageDialog(null,"Letras");
        }
        else if (curso==2){
            JOptionPane.showMessageDialog(null,"Matemática");
        }
        else if (curso==3){
            JOptionPane.showMessageDialog(null,"Biologia");
        }
        else if (curso>3){
            JOptionPane.showMessageDialog(null,"Inválido");
        }
        // Forma de ingresso
         if (ingre==1){
            JOptionPane.showMessageDialog(null,"Vestibular");
        }
        else if (ingre==2){
            JOptionPane.showMessageDialog(null,"Transferência");
        }
        else if (ingre==3){
            JOptionPane.showMessageDialog(null,"ENEM");
        }
        else if (ingre>3){
            JOptionPane.showMessageDialog(null,"Inválido");
        }
          if (st==1){
            JOptionPane.showMessageDialog(null,"1º semestre");
        }
        else if (st==2){
            JOptionPane.showMessageDialog(null,"2º semestre");
        }
        else if (st>3){
            JOptionPane.showMessageDialog(null,"Inválido");
        }
        //Cursos
        if (curso==1){
            JOptionPane.showMessageDialog(null,"Letras");
        }
        else if (curso==2){
            JOptionPane.showMessageDialog(null,"Matemática");
        }
        else if (curso==3){
            JOptionPane.showMessageDialog(null,"Biologia");
        }
        else if (curso>3){
            JOptionPane.showMessageDialog(null,"Inválido");
        }
        // Forma de ingresso
         if (ingre==1){
            JOptionPane.showMessageDialog(null,"Vestibular");
        }
        else if (ingre==2){
            JOptionPane.showMessageDialog(null,"Transferência");
        }
        else if (ingre==3){
            JOptionPane.showMessageDialog(null,"ENEM");
        }
        else if (ingre>3){
            JOptionPane.showMessageDialog(null,"Inválido");
        }
          if (st==1){
            JOptionPane.showMessageDialog(null,"1º semestre");
        }
        else if (st==2){
            JOptionPane.showMessageDialog(null,"2º semestre");
        }
        else if (st>3){
            JOptionPane.showMessageDialog(null,"Inválido");
        }
        
        JOptionPane.showMessageDialog(null,"O seu número é: "+num);
        JOptionPane.showMessageDialog(null,"Curso: "+curso);
        JOptionPane.showMessageDialog(null,"Forma de ingresso: "+ingre);
        JOptionPane.showMessageDialog(null,"Semestre: "+st);
        JOptionPane.showMessageDialog(null,"Ano de ingressão: "+ano);
   
        }
    }
    
}
