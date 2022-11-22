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
public class TesteFuncionario {
  String nome;
    double salarioBase = 1000;
    
    public void dobrarSalario(){
    this.salarioBase = this.salarioBase * 2;
    
}
     public double calcularFerias(){
        return this.salarioBase*1.33;  
    }
     
     public void descontaradiantamento(double valor){
         this.salarioBase = this.salarioBase - valor; 
     }
     
     public double calcularHoraExtras(double totalDeHoras) {
          return ((this.salarioBase/220)*2)*totalDeHoras;
     }    
}
