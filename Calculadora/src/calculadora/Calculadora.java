package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Declaração de variáveis
        double numInf1 = 0, numInf2 = 0, resultFinal = 0;
        char   operInf;
        
        // Entrada de dados
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe a operacao");
        operInf = sc1.next().charAt(0);
        // testa se usuário informou exponenciação
        // se for o caso pede somente um número
        if (operInf == 'E') {
            System.out.println("Informe o numero");
            numInf1 = sc1.nextDouble();
        } else {
            System.out.println("Informe o primeiro numero");
            numInf1 = sc1.nextDouble();
            System.out.println("Informe o segundo numero");
            numInf2 = sc1.nextDouble();
        }
        // testa a operação informada e executa a operação
        switch (operInf) {
            case '+': resultFinal = numInf1 + numInf2;
                      break;
            default:
                     System.out.println("Você informou uma operacao invalida");
        }
        
        
        
    }

    
}
