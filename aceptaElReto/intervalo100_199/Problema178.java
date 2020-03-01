/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @date 30 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema178 {

	/* 
	   * Acepta el reto 178
	   */

	  public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);
	      int n = Integer.parseInt(entrada.nextLine());
	      
	      String text1, text2 ;
	      Boolean iguales;
	      
	      for (int i = 0; i < n; i++) { // 2 textos por cada iteracion
	      text1 = entrada.nextLine().toLowerCase().replace(" ", ""); 
	      text2 = entrada.nextLine().toLowerCase().replace(" ", "");
	      iguales = false;
	      
	      int contador = 0;
	      
	      for (int j = 0; j < text1.length(); j++) {
	        if (text1.charAt(j) == text2.charAt(contador)) {
	          contador ++;
	        
	          if (contador == text2.length()) {
	            iguales = true;
	            break;
	          }
	        }
	      }
	          
	      System.out.println(iguales ? "SI" : "NO");
	      
	    }
	     entrada.close(); 
	  }
	
}
