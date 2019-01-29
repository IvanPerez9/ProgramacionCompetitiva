/**
 * 
 */
package programacionCompetitiva;

import java.util.Scanner;

/**
 * @date 29 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class siguienteBisiesto {

	public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);
	      int n = Integer.parseInt(entrada.nextLine());
	      int contador = 0;
	      while (contador < n){
	        int annio = Integer.parseInt(entrada.nextLine());
	        if (!esBisiesto(annio)){
	          for (int j = annio; j < annio+4; j++) {
	            if (esBisiesto(j)) { 
	              System.out.println(j);
	              break;
	              }
	          }
	        }
	        contador++;
	      }
	      entrada.close();
	 }
	  
	    public static boolean esBisiesto (int annio) {
	      if ((annio % 4 == 0) && ((annio % 100 != 0) || (annio % 400 == 0))) {
	        return true;
	      }else {
	        return false;
	      }
	    }
	
}
