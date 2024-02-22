package classepessoa;

import java.util.Scanner;

public class ClassePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica();
        Scanner sc = new Scanner(System.in);
        
        // Entradas
        System.out.print("Informe o nome da pessoa 1: ");
        pf1.nomePessoa = sc.nextLine();
        
        
        System.out.print("Informe o cpf da pessoa: ");
        pf1.cpfPessoa = sc.nextLine();
        
        System.out.print("Informe a idade da pessoa: ");
        pf1.idadePessoa = sc.nextInt();
        
        // Saída
        System.out.println("Nome: " + pf1.nomePessoa);
        System.out.println("Idade: " + pf1.idadePessoa);
        System.out.println("CPF: " + pf1.cpfPessoa);
    }
    
}
