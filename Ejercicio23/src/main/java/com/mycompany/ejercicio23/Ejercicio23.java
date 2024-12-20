/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        double a = sc.nextDouble();

        System.out.println("Ingrese el valor de B:");
        double b = sc.nextDouble();

        System.out.println("Ingrese el valor de C:");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else {
            double discriminante = (b * b) - (4 * a * c);

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La solución única es: x = " + x);
            } else {
              System.out.println("La solución está dentro del campo de los números imaginarios"); 
            }
        }
    }
}
