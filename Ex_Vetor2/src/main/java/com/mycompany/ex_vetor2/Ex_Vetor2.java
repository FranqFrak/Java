/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor2;

public class Ex_Vetor2 {

    public static void main(String[] args) {
        
         int[] numeros = new int[100]; 
         for(int i=0;i<100;i++){
          numeros[i] = 100 - i;
        } 
         System.out.println("Número em ordem Decrescente:");
          for(int i=0; i<100;i++){
           System.out.println(numeros[i]);
          
        }
         
    }
}
