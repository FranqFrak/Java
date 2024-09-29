/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor11;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class Ex_Vetor11 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int[] A = new int[10];
       int[] M = new int[10];
       
       for(int i=0;i<10;i++){
         System.out.println("Digite um numero:");
            A[i] = sc.nextInt(); 
       }
         System.out.println("Digite outro numero:");
          int x = sc.nextInt();
       for(int i=0;i<10;i++){
         M[i] = A[i] * x;
       } 
       for(int i=0; i<10;i++){
        System.out.println("Resultado:"+M[i]);
       }
        
    }
}
