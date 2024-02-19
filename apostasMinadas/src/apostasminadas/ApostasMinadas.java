package apostasminadas;

import java.util.ArrayList;
import java.util.Scanner;


public class ApostasMinadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dimensaoTabuleiro;
        ArrayList<ArrayList<Integer>> tabuleiro = new ArrayList<>(); //matriz tabuleiro
        double vlrAposta;
        int qtdDeMinas;
        double saldoFinal;
        double vlrMultiplicativo;
        int contaMinas = 0;
 
        System.out.print("Digite a dimenção do seu tabuleiro (5 = 5x5): ");
        dimensaoTabuleiro = sc.nextInt();
        
        System.out.print("Digite a qtd de minas no tabuleiro (min 1 max " + (Math.pow(dimensaoTabuleiro, 2) - 1) + "): ");
        qtdDeMinas = sc.nextInt();
        
        int[][] coordenadasMinadas = coordenadasMinadas(qtdDeMinas, dimensaoTabuleiro);
        vlrMultiplicativo = qtdDeMinas / Math.pow(dimensaoTabuleiro, 2);
        
        //preenchendo o tabuleiro
        for (int i = 0; i < dimensaoTabuleiro; i++) {
            ArrayList<Integer> linha = new ArrayList<Integer>();
            
            for (int j = 0; j < dimensaoTabuleiro; j++) {
                int mina = (int) (Math.round(Math.random()));
                if (mina == 1 && coordenadasMinadas[i][j]) {
                    contaMinas++;
                    linha.add(mina);
                } else {
                    linha.add(0);
                }
            }
            tabuleiro.add(linha);
        }
        
        
        //visualização do tabuleiro
        for (ArrayList<Integer> linha : tabuleiro) {
            for (int vlr : linha) {
                System.out.print(vlr + " ");
            }
            System.out.println();
        }
    }
    
    // Geraodr de coordenadas
    public static int[][] coordenadasMinadas(int qtdMinas, int ordemTabuleiro) {
        int[][] coordenadas = new int[qtdMinas][2]; //matriz tabuleiro
        
        for (int i = 0; i < qtdMinas; i++) {
            for (int j = 0; j < 2; j++) {
                coordenadas[i][j] = (int)(Math.round(Math.random() * ordemTabuleiro));
                System.out.println(coordenadas[i][j]);
            }
            System.out.println();
        }
        
        return coordenadas;
    }
}
