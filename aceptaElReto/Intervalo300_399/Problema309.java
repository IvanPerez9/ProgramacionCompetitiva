/**
 * 
 */
package Intervalo300_399;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema309 {
	  
	  /* 
	   * Acepta el reto 309
	   * Calculo mental
	   * 
	   * Ojo con el punto
	   * 2
	   * 15 + 3 + 6 .
	   * 7 - 2 - 1 + 25 - 1 .
	   * 
	   * 18, 24
	   * 5, 4, 29, 28
	   * 
	   */

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int n = Integer.parseInt(entrada.nextLine());
	    int resultado = 0;
	    
	    for (int i = 0; i < n; i++) {
	      resultado = Integer.parseInt(entrada.next());
	      String signo = entrada.next();
	      int numero = Integer.parseInt(entrada.next());
	      
	      while (!signo.equals(".")) {
	        if (signo.equals("+")) {
	          resultado += numero;
	        }else {
	          resultado -= numero;
	        }
	        
	        signo = entrada.next();
	        
	        if (signo.equals(".")) {
	          System.out.print(resultado);
	          resultado = 0;
	        }else {
	          System.out.print(resultado + ", ");
	          numero = Integer.parseInt(entrada.next());
	        }
	      }
	      System.out.println();
	    }
	    entrada.close();
	  }
}
