
package projetoaviaoariel;

import java.util.Scanner;

/**
 *
 * @author ariel_a_silva
 */
public class ProjetoAviaoAriel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // invocando classe scanner
        
        //inicializando variáveis
        String[] vetLugares          = new String[20];
        boolean[] vetLugaresOcupados = new boolean[20];
        
        //preenchendo vetor de Lugares para config inicial
        for (int i = 0; i < 20; i++) {
            vetLugares[i] = "M" + (i + 1);
            vetLugaresOcupados[i] = false;
        }
        
        while (true){
            System.out.println("____________Avião____________");
            System.out.println("""
                               ____________________________________
                               1 - Reservar Lugar;
                               2 - liberar Lugar;
                               3 - listar Lugares livres.
                               ____________________________________""");
            System.out.print("O que deseja fazer (digite o numero da opção)? ");
            int menu = sc.nextInt();
            
            switch(menu) {
                case 1 -> reservarLugar(vetLugaresOcupados, vetLugares);
                case 2 -> liberarLugar(vetLugaresOcupados, vetLugares);
                case 3 -> listarLugaresLivres(vetLugaresOcupados, vetLugares);
                default -> System.out.println("Opção invalida");
            }
            
            System.out.print("Deseja sair do programa [S/N]? ");
            char sairProg = sc.next().toUpperCase().charAt(0);
            
            if (sairProg == 'S') {
                break;
            }
        }
    }
    // função para listar Lugares
    static void listarLugaresLivres (boolean[] vetLugaresOcupados, String[] vetLugares) {
        System.out.println("Lugares LIVRES:");
        for (int i = 0; i < vetLugaresOcupados.length; i++) {
            if(!vetLugaresOcupados[i]){
                System.out.print(vetLugares[i] + " | ");
            }
        }
        System.out.println();
    }
    // função para liberar Lugares
    static void liberarLugar (boolean[] vetLugaresOcupados, String[] vetLugares) {
        Scanner sc = new Scanner(System.in); // traz a classe para a função
        
        System.out.print("Digite o código da Lugar: "); 
        String escolhaLugar = sc.next().toUpperCase();
        boolean econtrado = false;
        
        for (int i = 0; i < vetLugares.length; i++) {
            if (escolhaLugar.equals(vetLugares[i])){
                econtrado = true;
                
                if (!vetLugaresOcupados[i]) {
                    System.out.println("A Lugar já está livre.");
                } else if (vetLugaresOcupados[i]) {
                    vetLugaresOcupados[i] = false;
                    System.out.println("Lugar Liberada com sucesso!");
                }
            }
        }
        if (!econtrado) { // caso a input não tenha sido encontrado no vetor
            System.out.println("Lugar não encontrada digite o código corretamente!");
        }
    }
    // função para reservar Lugares
    static void reservarLugar (boolean[] vetLugaresOcupados, String[] vetLugares) {
        Scanner sc = new Scanner(System.in); // tras o sacanner pra função
        
        System.out.print("Digite o código da Lugar: ");
        String escolhaLugar = sc.next().toUpperCase();
        boolean econtrado = false;
        
        for (int i = 0; i < vetLugares.length; i++) {
            if (escolhaLugar.equals(vetLugares[i])){ //verifica se a escolha está no vetor
                econtrado = true;
                
                if (!vetLugaresOcupados[i]) { // se Lugar estiver livre
                    vetLugaresOcupados[i] = true; // Lugar fica ocupada
                    System.out.println("Reserva do Lugar " + vetLugares[i] + " realizado com sucesso!"); 
                } else if (vetLugaresOcupados[i]) { // caso esteja ocupada
                    System.out.println("Lugar Ocupado!");
                }
            }
        }
        if (!econtrado) { // caso a input não tenha sido encontrado no vetor
            System.out.println("Lugar não encontrada digite o código corretamente!");
        }
    }
}