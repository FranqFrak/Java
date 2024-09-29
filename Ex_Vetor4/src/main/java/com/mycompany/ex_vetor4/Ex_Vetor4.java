/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor4;

/**
 *
 * @author franq
 */
public class Ex_Vetor4 {

    public static void main(String[] args) {
       
       
      int[] numeros = new int[10]; 
        
       int index = 0; 
       for(int i=1;i<=20;i +=2){
         numeros[index] = i;
         index++;
       }
       System.out.println("Numeros impares:");
        for(int numero : numeros){
         System.out.println(numero);
       }
    }
}
