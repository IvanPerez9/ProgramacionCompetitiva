/**
 * 
 */
package Intervalo100_199;

import java.util.Scanner;

/**
 * @date 30 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema115 {

	  /* Acepta el reto 115
	   * 
	   * Números enteros positivos que, al ser elevados al cuadrado, pueden descomponerse
	   * en dos enteros positivos cuya suma es igual al número original.
	   * 
	   *  9 (9² = 81 y 8 + 1 = 9).
	   * 
	   */

	  public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);
	      boolean kaprekar = false;
	      
	      int numero;
	      int left;
	      int right;
	      int suma;
	      int unidades;
	      
	      numero = entrada.nextInt();
	      
	      while (numero != 0) {
	        
	        suma = 0;
	        left = numero * numero;
	        right = 0;
	        unidades = 1;
	        
	        // Paso todo a left y voy unidad a unidad mirando la suma
	        
	        while (left >0 && !kaprekar) {
	          right = right + (left % 10) * unidades;
	          left = left / 10;
	          unidades *= 10;
	          suma = left + right;
	          
	          kaprekar = (right > 0 && suma == numero) ? true : false ;
	        } 
	        
	        if (kaprekar) {
	          System.out.println("SI");
	        } else {
	          System.out.println("NO");
	        }
	        
	        numero = entrada.nextInt();
	        kaprekar = false;
	      }
	      entrada.close();
	  }
	
}
