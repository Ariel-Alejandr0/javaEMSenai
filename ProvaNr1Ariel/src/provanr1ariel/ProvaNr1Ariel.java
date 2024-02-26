package provanr1ariel;

import java.util.Scanner;

/**
 *
 * @author ariel_a_silva
 */
public class ProvaNr1Ariel {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in); // invocando classe Scanner
        char continuar = 'S';
        
        
        while (continuar == 'S') {
            // iniciando variáveis
            double vlrOriginal = 0;
            double vlrFinal;

            // recenbendo e validando a entrada
            while (vlrOriginal <= 0) {                
                System.out.print("Digite o Preço do produto: ");
                vlrOriginal = sc.nextDouble();
                if (vlrOriginal <= 0){
                    System.out.println("Opção Invalida!!!");
                }
            }

            vlrFinal = calculaValorFinal(vlrOriginal); // chamando função para calcular

            // saída
            System.out.println("O Preço final do produto após o desconto é: " + vlrFinal);
            
            // Condição para continuar no programa
            System.out.print("Deseja continuar no programa [S/N]? ");
            continuar = sc.next().toUpperCase().charAt(0);
            
            // validando Opção
            while (continuar != 'S' && continuar != 'N') {       
                System.out.println("Opção Inválida!!!");
                System.out.print("Deseja continuar no programa [S/N]? ");
                continuar = sc.next().toUpperCase().charAt(0);
            }
        }
    }
    //função para calcular os preços com desconto
    public static double calculaValorFinal (double vlrOriginal){
        double vlrFinal;
        
        if (vlrOriginal >= 100) {
            vlrFinal = vlrOriginal * (1 - 0.15); // calcula 15% de desconto
            } else if (vlrOriginal >= 50) {
                    vlrFinal = vlrOriginal * (1 - 0.10); // calcula 10% de desconto
                    } else {
                        vlrFinal = vlrOriginal; // preco permanesse o mesmo
                        }
        
        return vlrFinal;
    }
}
