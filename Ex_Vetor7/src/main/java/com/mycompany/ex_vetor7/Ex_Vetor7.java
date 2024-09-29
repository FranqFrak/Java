/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_vetor7;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class Ex_Vetor7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String[] nomes = new String[10];
       String nome;
       
       for(int i=0;i<10;i++){
        System.out.println("Digite um nome:");
           nomes[i] = sc.next();
       }
        System.out.println("Digite mais um nome:");
           nome = sc.next();
       
           boolean achei = false;
            for(int i=0;i<10;i++){
             if(nomes[i].equals(nome)){
               achei = true;
               break;
              }
            }
       if(achei){
           System.out.println("ACHEI um nome repetido");
       }
       else{
           System.out.println("NAO ACHEI nome repetido");
       }
    }
}
