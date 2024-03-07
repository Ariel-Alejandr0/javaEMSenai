package projetoaviaoariel;

import java.util.Scanner;


public class ProjetoAviaoAriel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[][] poltronas        = new String[3][4];
        boolean[][] poltronasStatus = new boolean[3][4];
        
       
        preenchePoltronas(poltronas);
        preenchePoltronas(poltronasStatus);
        listaPoltronas(poltronas);
        System.out.println(calculaPctg(poltronasStatus));
    }
    static void preenchePoltronas(String[][] poltronas){
        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                poltronas[i][j] = "L" + i + j;
            }
        }
    }
    static void preenchePoltronas(boolean[][] poltronasStatus){
        for (int i = 0; i < poltronasStatus.length; i++) {
            for (int j = 0; j < poltronasStatus[i].length; j++) {
                poltronasStatus[i][j] = false;
            }
        }
    }
    static void listaPoltronas(String[][] poltronas){
        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                System.out.print(poltronas[i][j] + " ");
            }
            System.out.println();
        }
    }
    static double calculaPctg(boolean[][] poltronasStatus){
        int countOcupados = 0;
        
        for (int i = 0; i < poltronasStatus.length; i++) {
            for (int j = 0; j < poltronasStatus[i].length; j++) {
                if (poltronasStatus[i][j]){
                    countOcupados++;
                }
            }
        }
        double pctg = countOcupados / (poltronasStatus.length * poltronasStatus[0].length) * 100;
        
        return pctg;
    }
}
