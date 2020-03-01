/**
 * 
 */
package intervalo100_199;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @date 7 feb. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema152 {

	/* 
	   * Acepta el reto 152
	   * Moda -> Valor o valores que mas se repiten en el conjunto
	   * 
	   */

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int casos = entrada.nextInt();
	    
	    
	    while (casos != 0) {
	    	int mayor = 0;
	    	String moda = "";
	    	HashMap<String, Integer> lista = new HashMap<>(); // Clave 
	    	
		    for (int i = 0; i < casos; i++) {
		      String numeroStr = entrada.next();
		      if (!(lista.containsKey(numeroStr))) {
		        String num = String.valueOf(numeroStr);
		        lista.put(num, 1);
		      } else {
		        String num = String.valueOf(numeroStr);
		        lista.put(num, lista.get(num)+1);
		      }
		      
		      Set<String>claves = lista.keySet();
		      for (String clave : claves) {
		        int repeticiones = lista.get(clave);
		        if (repeticiones > mayor) {
		          moda = clave;
		          mayor = repeticiones;
		        }
		      }
		    }
		    System.out.println(moda);
		    casos = entrada.nextInt();
	    }
	    entrada.close();
	  }
}
