/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor9;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class Ex_Vetor9 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in); 
       
       int[] Q = new int[20];
       int numero;
       int maior=0;
       int posicaomaior=0;
       
       
       for(int i=0;i<20;i++){
           System.out.println("Digite um numero positivo:");
            numero = sc.nextInt();
            
         if(numero > 0){
            Q[i] = numero;
            
            if(Q[i] > maior){
             maior = Q[i];
             posicaomaior = i;
            }
            else{
             i--;
            }
         }
       }
           System.out.println("O maior valor e:"+maior);
           System.out.println("Posicao do maior valor e:"+posicaomaior);
    }
}
