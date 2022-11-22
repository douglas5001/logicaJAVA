/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author 291900827
 */
public class notasVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in); 
        String nome; 
        
        float maior = Integer.MIN_VALUE;
        
        
        float menor = 0;
        
        float notas[] = new float[5];
        
      
        
        System.out.println(".; Sistema de Notas :/");
        System.out.println("Informe nome do aluno");
        
        nome = leia.next();
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a "+(i+1)+" do Aluno");
            notas[i] = leia.nextFloat();
            
            notas[4] += notas[i];
            
            if(menor == 0){
                menor = notas[i];
            
            }else if(notas[i] < menor){
                menor = notas[i];
            }
        }
        notas[4] = notas[4] / 4;
        
       for(int i = 0; i < notas.length; i++){
                if(notas[i] > maior) {
                    maior = notas[i];
                    
                }
            }
       
       
       
       
        
       
        System.out.print("O aluno(a) " + nome + "teve a média: ");
                System.out.printf("%.2f",notas[4]);
        if (notas[4] >= 7) {
            System.out.println("\nAprovado");
        }else{
            System.out.println("\nReprovado");
        }
        
        System.out.println("---Notas---");
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Notas"+ (i + 1)+": "+notas[i]);
        }
         
        
        System.out.println("---------------");
        
       
        for (int i = 3; i > -1 ; i--) {
            System.out.println("Notas"+ (i + 1)+": "+notas[i]);
        }
        
        System.out.println("O maior é "+maior);
         System.out.println("A menor é "+menor);
        
    }
    
}
