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
public class notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in); 
        String nome; 
        float nota1, nota2, nota3, nota4, media;
        
        System.out.println(".; Sistema de Notas :/");
        System.out.println("Informe nome do aluno");
        
        nome = leia.next();
        
        System.out.println("Informe n1 do Aluno");
        nota1 = leia.nextFloat();
        
        System.out.println("Informe n1 do Aluno");
        nota2 = leia.nextFloat();
        
        System.out.println("Informe n1 do Aluno");
        nota3 = leia.nextFloat();
        
        System.out.println("Informe n1 do Aluno");
        nota4 = leia.nextFloat();
        
        media = (nota1 + nota2 + nota3 + nota4) /4;
        
        System.out.println("O aluno(a) " + nome + "teve a média: "+ media);
        
        System.out.printf("%.2f",media);
        
        System.out.println("---------------");
        
        
        
    }
    
}
