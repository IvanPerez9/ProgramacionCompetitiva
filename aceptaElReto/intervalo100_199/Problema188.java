/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @date 29 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema188 {

	public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);
	      String [] palabrasL = new String[20];
	      boolean encadenado = false;
	      String linea ;
	      
	      while (entrada.hasNext()) {
	        
	        linea = entrada.nextLine();
	        palabrasL = linea.split(" ");
	        
	        // Si tiene 1 palabra o varias en la linea
	        
	        if (palabrasL.length <= 1) {
	          encadenado = true;
	        } else {
	          for (int i = 0; i < palabrasL.length-1; i++) {
	          String cad1 = palabrasL[i].substring(palabrasL[i].length() -2);
	          String cad2 = palabrasL[i+1].substring(0, 2);
	          
	          // encadenado = cad1.equals(cad2) ? true : false; // operador ternario -> result = testStatement ? value1 : value2;
	          
	          if (cad1.equals(cad2)) {
	            encadenado = true;
	          } else {
	            encadenado = false;
	            break;
	          }
	        }
	        }
	        if (encadenado) {
	          System.out.println("SI");
	        } else {
	          System.out.println("NO");
	        }
	        
	      }
	      entrada.close();
	  }
	
}
