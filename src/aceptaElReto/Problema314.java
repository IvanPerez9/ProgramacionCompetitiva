/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema314 {

	/* 
     * Acepta el reto 314
     * 
     * Picos y valles
     */

  public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  int n = entrada.nextInt();
	  for (int i = 0; i < n; i++) {
		  int nTemperaturas = entrada.nextInt();
		  int[] temperaturas = new int[nTemperaturas];
		  for (int j = 0; j < nTemperaturas; j++) {
			  temperaturas[j] = entrada.nextInt();
		  }
      
		  int contadorPicos = 0;
		  int contadorValles = 0;
		  
		  for (int j = 1; j < temperaturas.length -1; j++) { // Empezar en 1 y terminar en -1
			if ((temperaturas[j] < temperaturas[j-1]) && (temperaturas[j] < temperaturas[j+1]) ) {
				contadorValles++;
			}else if (temperaturas[j] > temperaturas[j - 1] && temperaturas[j] > temperaturas[j + 1]) {
				contadorPicos++;
			}
		  }
		  System.out.println(contadorPicos + " " + contadorValles);
	  }
	  entrada.close();
  }
}
