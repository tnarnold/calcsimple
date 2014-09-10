/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parks.calcsimple;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class Calc {

    public static void main(String[] args) {

        System.out.println("Escolha uma operação:\n"
                + "a) Somar\n"
                + "b) Subtrair\n"
                + "c) Multiplicar\n"
                + "d) Dividir\n");

        Scanner escolha = new Scanner(System.in);
        String opt = escolha.nextLine();
        switch (opt) {
            case "a":
                System.out.println("Implementar soma");
                break;
            case "b":
                System.out.println("Implementar subtrair");
                break;
            case "c":
                System.out.println("Implementar multiplicasr");
                break;
            case "d":
                System.out.println("Implementar dividir");
                break;
            default:
                break;
        }

    }
}
