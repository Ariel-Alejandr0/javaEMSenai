
package provaariel;

import java.util.Scanner;

/**
 *
 * @author ariel_a_silva
 */
public class ProvaAriel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // invocando classe scanner
        
        //inicializando variáveis
        String[] vetMesas          = new String[20];
        boolean[] vetMesasOcupadas = new boolean[20];
        
        //preenchendo vetor de mesas para config inicial
        for (int i = 0; i < 20; i++) {
            vetMesas[i] = "M" + (i + 1);
            vetMesasOcupadas[i] = false;
        }
        
        while (true){
            System.out.println("____________RESTAURANTE____________");
            System.out.println("""
                               ____________________________________
                               1 - Reservar mesa;
                               2 - liberar mesa;
                               3 - listar mesas livres.
                               ____________________________________""");
            System.out.print("O que deseja fazer (digite o numero da opção)? ");
            int menu = sc.nextInt();
            
            switch(menu) {
                case 1 -> reservarMesa(vetMesasOcupadas, vetMesas);
                case 2 -> liberarMesa(vetMesasOcupadas, vetMesas);
                case 3 -> listarMesasLivres(vetMesasOcupadas, vetMesas);
                default -> System.out.println("Opção invalida");
            }
            
            System.out.print("Deseja sair do programa [S/N]? ");
            char sairProg = sc.next().toUpperCase().charAt(0);
            
            if (sairProg == 'S') {
                break;
            }
        }
    }
    // função para listar mesas
    static void listarMesasLivres (boolean[] vetMesasOcupadas, String[] vetMesas) {
        System.out.println("MESAS LIVRES:");
        for (int i = 0; i < vetMesasOcupadas.length; i++) {
            if(!vetMesasOcupadas[i]){
                System.out.print(vetMesas[i] + " | ");
            }
        }
        System.out.println();
    }
    // função para liberar mesas
    static void liberarMesa (boolean[] vetMesasOcupadas, String[] vetMesas) {
        Scanner sc = new Scanner(System.in); // traz a classe para a função
        
        System.out.print("Digite o código da mesa: "); 
        String escolhaMesa = sc.next().toUpperCase();
        boolean econtrado = false;
        
        for (int i = 0; i < vetMesas.length; i++) {
            if (escolhaMesa.equals(vetMesas[i])){
                econtrado = true;
                
                if (!vetMesasOcupadas[i]) {
                    System.out.println("A mesa já está livre.");
                } else if (vetMesasOcupadas[i]) {
                    vetMesasOcupadas[i] = false;
                    System.out.println("Mesa Liberada com sucesso!");
                }
            }
        }
        if (!econtrado) { // caso a input não tenha sido encontrado no vetor
            System.out.println("Mesa não encontrada digite o código corretamente!");
        }
    }
    // função para reservar mesas
    static void reservarMesa (boolean[] vetMesasOcupadas, String[] vetMesas) {
        Scanner sc = new Scanner(System.in); // tras o sacanner pra função
        
        System.out.print("Digite o código da mesa: ");
        String escolhaMesa = sc.next().toUpperCase();
        boolean econtrado = false;
        
        for (int i = 0; i < vetMesas.length; i++) {
            if (escolhaMesa.equals(vetMesas[i])){ //verifica se a escolha está no vetor
                econtrado = true;
                
                if (!vetMesasOcupadas[i]) { // se mesa estiver livre
                    vetMesasOcupadas[i] = true; // mesa fica ocupada
                    System.out.println("Reserva da mesa " + vetMesas[i] + " realizada com sucesso!"); 
                } else if (vetMesasOcupadas[i]) { // caso esteja ocupada
                    System.out.println("Mesa Ocupada!");
                }
            }
        }
        if (!econtrado) { // caso a input não tenha sido encontrado no vetor
            System.out.println("Mesa não encontrada digite o código corretamente!");
        }
    }
}
