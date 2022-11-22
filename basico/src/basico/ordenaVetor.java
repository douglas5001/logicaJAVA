/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;
import javax.sound.midi.Soundbank;


public class ordenaVetor {

    static Scanner leia = new Scanner(System.in);
     static int vetor[]= new int[5];
    public static void main(String[] args) {
        
        
          
        
        
         
        int opM;
       
      
      do {
                menuVetor();
                opM = leia.nextInt();
                
           switch(opM) {

           case 1:
               System.out.println("-Ler Vetor-");
               populaVetor();
           break;

            case 2:
                 System.out.println("-Imprimir-");
                 imprimeVetor();
            break;

            case 3:
                 System.out.println("-Ordenar Crescente-");
                 ordemCres();
            break;
            
            case 4:
                 System.out.println("- Ordem Descrescente-");
                 ordemdecres();
            break;
            
            case 0:
                System.out.println("- Aplicação encerrada pelo usuário -");
                break;

               default:

}
                
      } while (opM != 0);  
    }
    
   

    private static void menuVetor() {
        System.out.println("<-- Menu Principal -->");
        System.out.println("1 - Ler Vetor");
        System.out.println("2 - Imprimir Vetor");
        System.out.println("3 - Ordem crescente");
        System.out.println("4 - Ordem Decrescente");
        System.out.println("4 - Sair");
        System.out.print("Digite a opção de menu: ");
        
        
    }

    private static void populaVetor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o "+ (i + 1) + "º Valor : ");
            vetor[i] = leia.nextInt();
        }
    }
    
    
    private static void imprimeVetor(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor["+i+"]:" + vetor[i]);
        }
        
    }
    
    private static void ordemCres(){
            int aux;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(vetor[j]<vetor[i]){
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                        
                    }
                }
            }
        }
    
    private static void ordemdecres(){
            int aux;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(vetor[j] > vetor[i]){
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                        
                    }
                }
            }
        }
    
}
