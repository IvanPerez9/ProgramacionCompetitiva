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
 *
 * Tu programa debe usar la fuerza bruta para encontrar la respuesta de la vida, el universo y todo lo dema´s de forma que, 
 * todos aquellos nu´meros que no contengan la respuesta se deben reescribir por pantalla, la respuesta a la vida, el universo y todo lo demas es 42.
 * La entrada contiene un numero N por cada linea leida, correspondiente a un posible nu´mero a la respuesta de la vida, el universo y todo lo demas. 
 * Se debe leer hasta ﬁnal de ﬁchero (EOF)
 * La entrada debe ser leida de forma estandar.
 * Se deben reescribir todos aquellos nu´meros que no sean la respuesta a la pregunta que planteamos en este problema.
 *
 */
public class respuestaVida {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    while (entrada.hasNext()) {
	      Integer linea = Integer.parseInt(entrada.nextLine());
	      if (linea != 42) {
	        System.out.println(linea);
	      }
	    }
	    entrada.close();
	  }
}
