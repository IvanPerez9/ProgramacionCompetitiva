/**
 * 
 */
package Curso19;

import java.util.Scanner;

/**
 * @date 29 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 * 	La primera línea contiene un entero T denotando el numero de casos de prueba.
 *  Cada caso de prueba contiene solo un numero Y con el an˜o actual.
 *  La entrada debe ser leida de forma estandar.
 *  Para cada caso imprime un nu´mero con el siguiente anno bisiesto siguiendo las reglas del calendario gregoriano.
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
