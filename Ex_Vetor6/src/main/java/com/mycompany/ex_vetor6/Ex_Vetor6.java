
package com.mycompany.ex_vetor6;


public class Ex_Vetor6 {

    public static void main(String[] args) {
       int[] vetor ={5,1,4,2,7,8,3,6};  
       int aux=0;
       
        for(int i=8;i<5;i--){
         aux = vetor[i];
          vetor[i] = vetor[8-i+1];
          vetor[8-i+1]=aux;
         } 
        vetor[3]=vetor[1];
        vetor[vetor[3]]=vetor[vetor[2]];
        
         System.out.println("Conteudo do vetor");
         for(int i=0;i<vetor.length;i++){
           System.out.print(vetor[i]+" ");
         }
    }
}
