/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor12;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class Ex_vetor12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] numeros = new int[20];
      
      for(int i=0; i<20; i++){
        System.out.println("Digite um numero "+(i+1)+":");
          numeros[i] = sc.nextInt();
       }
      for(int i=19;i>0;i--){
        System.out.println("Ordem inversa dos numeros"+numeros[i]);
      }
    }
}
