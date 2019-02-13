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
public class Problema313 {
	  /* 
	   * Acepta el reto 313
	   * Fin de mes
	   * 
	   */

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int numero = Integer.parseInt(entrada.nextLine());
	    
	    for (int i = 0; i < numero; i++) {
	      int saldo = Integer.parseInt(entrada.next());
	      int gasto = Integer.parseInt(entrada.next());
	      
	      System.out.println(saldo + gasto >=0 ? "SI" : "NO");
	    }
	    entrada.close();
	  }
}
