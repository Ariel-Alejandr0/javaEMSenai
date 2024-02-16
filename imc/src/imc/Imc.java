/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author ariel_a_silva
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char sexo = 'N';
        int x;
        double peso;
        double altura;
        double imc;
        double[][] tabelasImc = 
        {{20.0, 24.9, 29.9, 34.9, 39.9, 40},
         {19,   23.9, 28.9, 33.9, 38.9, 39}};
        
        char continuar = 'S';

        while (continuar == 'S') {
            System.out.print("Digite seu peso (em Kg): ");
            peso = sc.nextDouble();

            System.out.print("Digite sua altura (em metros): ");
            altura = sc.nextDouble();
            
            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Digite o seu sexo [M/F]: ");
                sexo = sc.next().toUpperCase().charAt(0);
                
                if (sexo != 'M' && sexo != 'F'){
                    System.out.println("Resposta inválida digite novamente!");
                }
            }

            //verfica o sexo e escolhe a linha dos valores
            if (sexo == 'M') {
                x = 0;
            } else {
                x = 1;
            }

            //calculando imc
            imc = peso / (altura * altura);
            imc = Math.round(imc * 100.0) / 100.0;

            System.out.print("Seu imc é: " + imc + " sua sitação é ");

            //verifica a situação pela situação do imc
            if (imc <= tabelasImc[x][0]) {
                System.out.println("Magresa!");
                } else if (imc <= tabelasImc[x][1]) {
                    System.out.println("Normal");
                    } else if (imc <= tabelasImc[x][2]) {
                        System.out.println("Sobrepeso");
                        } else if (imc <= tabelasImc[x][3]) {
                            System.out.println("Obesidade grau I");
                            } else if (imc <= tabelasImc[x][4]) {
                                System.out.println("Obesidade grau II");
                                } else if (imc >= tabelasImc[x][5]) {
                                    System.out.println("Obesidade grau III");
                                    }
            
            System.out.print("Deseja continuar [S/N]? ");
            continuar = sc.next().toUpperCase().charAt(0);
            
            if (continuar != 'S' && continuar != 'N') {
                while (continuar != 'S' && continuar != 'N') {                    
                    System.out.println("Resposta inválida digite novamente!");
                    System.out.print("Deseja continuar [S/N]? ");
                    continuar = sc.next().toUpperCase().charAt(0);
                }
            }
        }
    }

}
