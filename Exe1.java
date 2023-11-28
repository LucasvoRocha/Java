package loops;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala?:  ");
        int quant_alunos = entrada.nextInt();

        double somanotas = 0;
        int cont_alunos = 0;

        while (cont_alunos < quant_alunos) {
        	
            System.out.print("Digite a nota do aluno " + (cont_alunos + 1) + ": ");
            double nota = entrada.nextDouble();

            somanotas += nota;

            cont_alunos++;
        }


        double media = somanotas / quant_alunos;


        System.out.println("A média da turma é: " + media);

        entrada.close();
     }
   }