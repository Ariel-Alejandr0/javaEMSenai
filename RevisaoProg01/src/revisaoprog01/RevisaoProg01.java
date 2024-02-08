package revisaoprog01;

import java.util.Scanner;

public class RevisaoProg01 {
    public static void main(String[] args) {
        //importando classes
        Scanner sc  = new Scanner(System.in);
        
        // Criação das variáveis
        int     idadePessoa;
        String  nomePessoa;
        char    usuarioAtivo;
        double  salarioPorHora;
        int     horasMensais;
        double  salarioTotal;
        // inputs
        System.out.print("Digite sua idade: ");
        idadePessoa = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        nomePessoa = sc.nextLine();
        
        System.out.print("O usuario está ativo? [S/N]");
        usuarioAtivo = sc.next().toUpperCase().charAt(0);

        System.out.print("Informe o salário por hora do funcionario: ");
        salarioPorHora = sc.nextDouble();

        System.out.print("Informe a quantidade de horas mensais trabalhadas: ");
        horasMensais = sc.nextInt();

        salarioTotal = salarioPorHora * horasMensais;

        //condicionais
        if (salarioPorHora > 220) {
            salarioTotal = salarioTotal * 1.1;
        }

        //output
        System.out.printf("Nome: %s\n" +
                "idade: %s\n" +
                "horas mensais: %s\n" +
                "salario total %.2f: ",
                nomePessoa, idadePessoa, horasMensais, salarioTotal);
    }
}
