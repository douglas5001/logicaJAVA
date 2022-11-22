/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author 291900827
 */
public class Main {
  
    
   
    
    public static void main(String[] args) {
    
         TesteFuncionario fun = new TesteFuncionario();
         
    
    fun.nome = "Carla";
    fun.salarioBase = 15845.90;
    
    
    fun.dobrarSalario();
    
    fun.descontaradiantamento(600);
    
    double ferias = fun.calcularFerias();
    
    double horasExtras = fun.calcularHoraExtras(10);
    
        System.out.println("Olá, "+ fun.nome + ", seu salario é de R$"+ fun.salarioBase);
        System.out.println("O valor de suas férias é de R$"+ ferias);
        System.err.println("O valor de suas horas extras é de R$"+ horasExtras);
    }
    
}
