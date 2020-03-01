/**
 * 
 */
package intervalo200_299;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema205 {
	  
	  /* 
	   * Acepta el reto 205
	   * 
	   */

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int n = Integer.parseInt(entrada.nextLine());

	    for (int i = 0; i < n; i++) {
	      int numero = Integer.parseInt(entrada.nextLine());
	      lycherl(numero);
	    }
	    entrada.close();
	    
	  }
	  
	  public static void lycherl (int num) {
	    int contador = 1;
	    int n = num;
	    int reverse = Capicua(n);
	    boolean condicion = false;
	    // int suma
	    
	    while (!condicion && (reverse + n) <= 1000000000) {
	      if ((n+reverse == Capicua(n+reverse))) {
	        condicion = true;
	      } else {
	        n = n + reverse;
	        reverse = Capicua(n);
	        contador++;
	      }
	    }
	    System.out.println(condicion ? contador +"," + n + reverse : "Lychrel?");
	  }
	  
	  public static int Capicua (int num) {
	    int auxiliar = num;
	    int reverse = 0;
	    int cifra = 0;
	    while (auxiliar != 0) {
	      cifra = auxiliar % 10;
	      reverse = reverse * 10 + cifra;
	      auxiliar = auxiliar/10;
	    }
	    return reverse;
	  }
}
