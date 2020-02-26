/**
 * 
 */
package Intervalo100_199;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema119 {

	/*
	 * 119 Escudos romanos : Numero de escudos minimo
	 * 
	 * - Formaciones de 1 validas
	 */
	
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int romanos;
	        int escudos;
	        int minCuadrado;

	        while ((romanos = entrada.nextInt()) != 0) {
	        	escudos = 0;
	            while (romanos != 0) {
	            	minCuadrado = (int) Math.pow((int) Math.sqrt(romanos), 2); 
	            	escudos += ((int) Math.sqrt(romanos) * 4) + minCuadrado;
	                romanos -= minCuadrado;
	            }
	            System.out.println(escudos);
	        }
	        entrada.close();
	    }
}
