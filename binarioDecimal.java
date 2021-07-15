package Semana6;

/**
 * Nombre del programa: 
 * Descripcion: Haga un algoritmo que dado un número binario N (entero y positivo), 
    calcule a qué valor corresponde N en base 10. Ej: 11011 en binario, es 27 en base 10.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp5w6 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int numeroBinario, digito, decimal=0;
        int exponente=0;
        
        escribir.println("Digite un numero binario:");
        numeroBinario = Integer.parseInt(leer.readLine());
        
        while(numeroBinario != 0){
            digito = numeroBinario%10;

            decimal = decimal + (digito * (int) Math.pow(2, exponente));

            exponente++;

            numeroBinario = numeroBinario / 10;

        }
    
        System.out.println("Decimal: " + decimal);

        
    }
}