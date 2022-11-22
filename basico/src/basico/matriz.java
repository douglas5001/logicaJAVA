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
public class matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int matriz[][] = new int[4][5];

        System.out.println("-- Matriz --");

        for (int i = 0; i < 4; i++) {//percorre a linha
            for (int j = 0; j < 5; j++) {//percorre a coluna
                System.out.print("Informe valor matriz[" + (i + 1) + "][" + (j + 1) + "]: ");

                matriz[i][j] = keyboard.nextInt(); // percorre a matriz na posição i,j

            }
        }

        System.out.println("-- Impressão Matriz --");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Matriz[" + (i + 1) + "][" + (j + 1) + "]:" + matriz[i][j]);
            }
        }
        
        
        
        System.out.println("--Impressão em farmato Matriz--");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("|"+matriz[i][j]);
                
            }
            System.out.print("|\n");
        }

    }

}
