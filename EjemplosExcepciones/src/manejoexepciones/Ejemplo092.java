/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        
        while (bandera) {
            try {
                System.out.println("Ingrese un pais que inicie con consonante ");
                String valor1 = entrada.nextLine();
                
                valor1 = valor1.toUpperCase();
                char letra = valor1.charAt(0);
                String primeraLetra = (String.valueOf(letra));
                        
                if (primeraLetra.equals("A") || 
                        primeraLetra.equals("E") || 
                        primeraLetra.equals("I") || 
                        primeraLetra.equals("O") || 
                        primeraLetra.equals("U")) {
                    throw new Exception("País debe iniciar con consonante");
                }
                String resultado = "";
                resultado = String.format("%s%s\n", resultado, valor1);
                System.out.printf("Resultado %s\n", resultado);
                bandera = false;
                
            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }
    }
}
