/**
 * 
 */
package aceptaElReto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema510 {

	  /* 
	   * Acepta el reto 510
	   * 
	   * Marketing de zapatos :
	   * Salida los números positivos estarán ordenados de menor a mayor, 
	   * y los negativos de mayor a menor.
	   * 
	   */

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int n = Integer.parseInt(entrada.nextLine());
	    
	    
	    while (n != 0) {
	      ArrayList<Integer> almacen = new ArrayList<>();
	      ArrayList<Integer> almacenNegativo = new ArrayList<>();
	      ArrayList<Integer> almacenPosicion = new ArrayList<>();
	      for (int i = 0; i < n; i++) {
	        Integer zapato =Integer.parseInt(entrada.next());
	        if (zapato < 0) {
	          almacenNegativo.add(zapato);
	          almacenPosicion.add(i, -1);
	        }else {
	          almacen.add(zapato);
	          almacenPosicion.add(i, 1);
	        }
	      }
	      Collections.sort(almacen);
	      Collections.sort(almacenNegativo , Comparator.reverseOrder());
	      
	      int contadorNegativo = 0;
	      int contadorPositivo = 0;
	      
	      for (int i = 0; i < n; i++) {
	        if (almacenPosicion.get(i).equals(-1)){
	          System.out.print(almacenNegativo.get(contadorNegativo)+ " ");
	          contadorNegativo++;
	        } else {
	          System.out.print(almacen.get(contadorPositivo) + " ");
	          contadorPositivo++;
	        }
	      }
	      System.out.println(" ");
	      n = entrada.nextInt();
	    }
	    entrada.close();
	  }
}
