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
public class array {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int[] arrayBase;
   arrayBase = new int[ 20 ];
   System.out.printf("%s %10s \n", "Index", "Valores");
   //GERA A SAÍDA DO VALOR DE CADA ELEMENTO DO ARRAY
   for(int i = 0; i < arrayBase.length; i++)
    System.out.printf("%3d %10d \n", i, arrayBase[ i ]);
   }
        
        
        
        
    }
    
