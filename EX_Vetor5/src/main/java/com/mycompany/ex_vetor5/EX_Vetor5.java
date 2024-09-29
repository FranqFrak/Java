/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor5;

import java.util.Scanner;
public class EX_Vetor5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
      int[] numeros = new int[10];
      
     for(int i=0;i<10;i++){
       System.out.println("Digite um numero:");
        numeros[i] = sc.nextInt();
     }
      System.out.println("Valores recebidos:");
     for(int i=0;i<10;i++){
      System.out.print(numeros[i]+",");
      }  
    }
}
