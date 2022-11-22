/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 291900827
 */
public class consumo {
    
    
    public static void main(String[] args) {
        
        
        //Estancias 
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> agenda = new ArrayList();
        
        //variaveis
        double combustivel, consumo, distancia, valorCorrida , litro = 6.99;
    
        System.out.println(".: Qualç a eficiencia do veiculo ");
        combustivel = keyboard.nextDouble();
        System.out.println("Qual a distancia percorrida.: ");
        
        distancia = keyboard.nextDouble();
        
        consumo = litro * combustivel;
        
        
        valorCorrida = distancia * litro;
        
       
        
        agenda.add(" O Consumo é " + consumo);
        agenda.add(" Valor da Corrida vai sair R$ " + valorCorrida);
        
        
      int i = 1;
      for (String contato: agenda) {
      System.out.printf("Resposta %d %s\n", i, contato);
      i++;
    }
        
       
       
                
 
        
        
    }
}
