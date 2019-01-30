/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @date 30 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema140 {

	  /* Acepta el reto 140
	   * 
	   * Se trata de implementar un programa que sume los dígitos de un número entero no negativo. 
	   * Por ejemplo, la suma de los dígitos del 3433 es 13
	   * 
	   * 3 + 4 + 3 + 3 = 13.
	   * 
	   */

	  public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);
	      String num;
	      int suma;
	      int digitos;
	        
	      suma = 0;
	      
	      do {
	        num = entrada.nextLine();
	        
	        if (("" + num.charAt(0)).equals("-")){
	          break;
	        }
	        
	        for (int i = 0; i < num.length(); i++) {
	        digitos = Integer.parseInt("" + num.charAt(i));
	        suma += digitos;
	          
	        if (i == num.length() -1 ) {
	          System.out.println(digitos + "=" + suma);
	        }else {
	          System.out.print(digitos + " + ");
	        }
	        }
	       
	      } while (Integer.parseInt(num) > -1);
	      entrada.close();
	  }
}
