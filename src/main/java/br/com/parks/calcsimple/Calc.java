/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.parks.calcsimple;

/**
 *
 * @author tiago
 */
public class Calc {
    public static void main(String[] args) {
        Funcoes f=new Funcoes();
        double resultado=f.multiplica(8, 45);
        System.out.println(resultado);
        resultado=f.divide(8, 4);
        System.out.println(resultado);
        
        System.out.println("soma: " + f.soma(10, 15));
        System.out.println("soma: " + f.subtrai(10, 15));
        
    }
}
