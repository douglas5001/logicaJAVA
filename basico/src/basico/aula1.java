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
public class aula1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia =  new Scanner(System.in);
        
        float valor, total;
                int quant;
        
        System.out.println("Olá jair");
        System.err.println(".: Sistema de vendas");
        valor = leia.nextFloat();
                
        System.out.println("Informe a quantidade");
        quant = leia.nextInt();
        
        total = valor * quant;
        
        System.err.println("Valor final é:" + total);
    }
    
}
