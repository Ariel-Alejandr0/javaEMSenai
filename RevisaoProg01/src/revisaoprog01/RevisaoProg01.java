package revisaoprog01;

import java.time.LocalDate;
import java.util.Scanner;

public class RevisaoProg01 {
    public static void main(String[] args) {
        //importando classes
        Scanner sc  = new Scanner(System.in);
        
        // Criação das variáveis
        int     idadePessoa;
        String  nomePessoa;
        char    usuarioAtivo;
        boolean usuarioVacinado;
        double  salarioTotal; 
        
        // inputs
        System.out.print("Digite sua idade: ");
        idadePessoa = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        nomePessoa = sc.nextLine();
        
        System.out.print("O usuario está ativo? [s/n]");
        usuarioAtivo = sc.next().toUpperCase().charAt(0);
        
        
    }
}
