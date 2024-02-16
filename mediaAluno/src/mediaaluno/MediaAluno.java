package mediaaluno;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        int qtdeNotas, contaNotas = 1;
        double acumulaNotas = 0, notaAluno, mediaAluno = 0;
        char fimProg = 'N';
        
        Scanner sc1 = new Scanner(System.in);
        //Entrada de  dados
        // Laço repetição para alunos
        while(fimProg == 'N') {
            System.out.print("Informe a qtde de notas: ");
            qtdeNotas = sc1.nextInt();
            // Laço de repetição para notas
            acumulaNotas = 0;
            while (contaNotas <= qtdeNotas) {
                System.out.print("Informe a nota do aluno: ");
                notaAluno = sc1.nextDouble();
                acumulaNotas = acumulaNotas = notaAluno;
                contaNotas++; // contaNotas = contaNotas + 1
            }
            // calcula e mostra a média
            mediaAluno = acumulaNotas / qtdeNotas;
            System.out.printf("A media do aluno : ", mediaAluno + "\n");
            // testa a média e imprime a situação do aluno
            if(mediaAluno < 5) {
               System.out.println("Aluno reprovado");
            } else if (mediaAluno >= 5 && mediaAluno < 7.5) {
                       System.out.println("Aluno em PPE");
                  }else {
                        System.out.println("Aluno Aprovado");
                    }
        // perguntar se prossegue no programa
            System.out.print("Finaliza programa?(S/N)");
            fimProg = sc1.next().toUpperCase().charAt(0);
            while (fimProg != 'S' && fimProg != 'N') {
                System.out.print("Opcao Invalida (S/N)");
                fimProg = sc1.next().toUpperCase().charAt(0);
            }
        }
        // finaliza programa
    }
}
