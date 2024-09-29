/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor8;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class Ex_vetor8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
      
       double[] nota = new double[20];
       double soma = 0,media;
       double acimamedia=0;
       
       for(int i=0;i<20;i++){
           System.out.println("Digite a nota "+(i+1)+":");
            nota[i] = sc.nextDouble();
           
            soma +=nota[i];
       }
       media = soma/20;
       for(int i=0;i<20;i++){
          if(nota[i] > acimamedia){
           acimamedia++;
          }
       }
         System.out.println("media da turma:"+media);
         System.out.println("Alunos acima da media"+acimamedia);
        
    }
}
