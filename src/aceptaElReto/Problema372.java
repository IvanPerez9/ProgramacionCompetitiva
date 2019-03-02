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
public class Problema372 {

	/* 
     * Acepta el reto 372
     * 
     * 
     * Dar la vuelta a la frase que se pase
     * 
     */

  
	  public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  int n = entrada.nextInt();
		  StringBuilder salida = new StringBuilder();
		  String frase = entrada.nextLine();
		    
		  for (int i = 0; i < n; i++) {
			  
			  StringBuilder auxSb = new StringBuilder(entrada.nextLine());
			  if (auxSb.length() != 1) {
				  auxSb.reverse();
				  char first = auxSb.charAt(0);
				  char last = auxSb.charAt(auxSb.length() - 1);
				  if (Character.isUpperCase(last)) {
					  auxSb.deleteCharAt(auxSb.length() - 1);
					  auxSb.append(Character.toLowerCase(last));
					  auxSb.deleteCharAt(0);
					  auxSb.insert(0, Character.toUpperCase(first));
				  }
			  }
			  salida.append(auxSb.toString() + "\n");
		  }
		  System.out.print(salida.toString());
		  entrada.close();
	  	}
}
