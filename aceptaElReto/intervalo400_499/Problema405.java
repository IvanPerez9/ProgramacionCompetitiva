/**
 * 
 */
package intervalo400_499;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema405 {
	
	/* 
     * Acepta el reto 405
     * 
     * 
     */
  public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  int numero, aux , aux1;
	  boolean condicion ;
	  
	  while(true) {
		  numero = entrada.nextInt();
		  if (numero == 0) break;
		  condicion = false;
		  aux1 = numero;
		  while(true) {
			  aux = entrada.nextInt();
			  if (aux1 == aux -1) {
				  condicion = true;		  
			  } else {
				  if (condicion) {
					  System.out.print(numero + "-" + aux1);
					  numero = aux;
					  condicion = false;
					  if(aux != 0) System.out.print(",");
				  } else {
					  System.out.print(aux1);
					  numero = aux;
					  if(aux != 0) System.out.print(",");
				  }
			  }
			  aux1 = aux;
			  if (aux==0) break;
		  }
		  System.out.println();
	  }
	  entrada.close();
  }
}