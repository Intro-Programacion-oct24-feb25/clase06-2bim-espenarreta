/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();

        double[] resultados = new double[valor];

        boolean bandera = true;

        while (bandera) {
            try {
                int valor1;
                int valor2;
                double resultado;

                for (int i = 0; i < resultados.length; i++) {
                    System.out.println("Ingrese el valor 1 a dividir");
                    valor1 = entrada.nextInt();
                    System.out.println("Ingrese el valor 2 a dividir");
                    valor2 = entrada.nextInt();
                    
                    resultado = valor1 / valor2;
                    resultados[i] = resultado;
                }
                
                System.out.printf("Resultados:\n");
                for (int i = 0; i < resultados.length; i++) {
                    System.out.printf("%.2f\n", resultados[i]);
                }
                bandera = false;

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                entrada.nextLine();

            }
            /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        }
    }
}
