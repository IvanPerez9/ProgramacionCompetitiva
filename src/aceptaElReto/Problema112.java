/**
 * 
 */
package aceptaElReto;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema112 {
	  
	  /* 
	     * 112 - Radares de Tramo
	     */

	  public static void main(String[] args) throws IOException {

	    /*
	     * Distancia, velocidad maxima, numero de segundos
	     * Salida: Si supera en 20% la velocidad maxima MULTA , si la supera PUNTOS 
	     * Tiempo negativo ERROR
	     */
	    Scanner entrada = new Scanner(System.in);
	    String linea ;
	    
	    while (!(linea = entrada.nextLine()).equals("0 0 0")) {
	      String[] numeros = linea.split(" ");
	      int distancia = Integer.parseInt(numeros[0]);
	      int max = Integer.parseInt(numeros[1]);
	      int tiempo = Integer.parseInt(numeros[2]);
	      
	      if ((distancia <= 0) || (max <= 0) || (tiempo <= 0)) {
	        System.out.println("ERROR");
	      } else {
	        
	        float avg = (float) distancia /  (float) tiempo ; // Necesario casteo, sino redondea
	        avg *= 3.6 ; 
	        if (avg < max) {
	          System.out.println("OK");
	        } else {
	          float veintePorciento = (float) (0.2 * max) ;
	          if ((avg - max) < veintePorciento) {
	            System.out.println("MULTA");
	          } else {
	            System.out.println("PUNTOS");
	          }
	        }
	      }
	    }
	    entrada.close();
	  }
}
