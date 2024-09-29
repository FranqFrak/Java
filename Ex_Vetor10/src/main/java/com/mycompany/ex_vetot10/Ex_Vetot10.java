/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetot10;

/**
 *
 * @author franq
 */


  import java.util.Scanner;

public class Ex_Vetot10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Q = new int[20];
        int menor = Integer.MAX_VALUE; // Inicializa com o maior valor possível
        int posicaoMenor = 0;

        // Leitura do vetor Q e identificação do menor valor
        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();

            // Garante que o número seja positivo
            if (numero > 0) {
                Q[i] = numero;

                // Verifica se o número é o menor até agora
                if (Q[i] < menor) {
                    menor = Q[i];
                    posicaoMenor = i;
                }
            } else {
                i--; // Repete a leitura caso o número não seja positivo
            }
        }

        // Exibe o menor valor e sua posição
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor valor: " + posicaoMenor);

        scanner.close();
    }
}


