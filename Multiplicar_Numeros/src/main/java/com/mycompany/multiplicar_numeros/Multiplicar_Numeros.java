/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multiplicar_numeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Multiplicar_Numeros {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        double numero1 = m.nextDouble();
        double numero2 = m.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
