/**
 * 
 */
package Intervalo400_499;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema441 {

	/*
	 * Contar hasta el final
	 * 
	 * Da igual el formato y hasta 1000. Tener en cuenta el punto
	 */
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String salida, aux;
		int posicion;
		while (entrada.hasNext()) {
			salida = "";
			posicion = 0;
			aux = entrada.nextLine().replace(".", "");
			int solucion = Integer.parseInt(aux) +1;
			
			//Ojo esto: Si no no sumo el 1
			
			aux = solucion + "" ;
			
			// Pintar la salida
			
			for (int i = aux.length()-1; i >= 0; i--) {
				if (((posicion % 3) == 0) && (posicion != 0)) {
					salida = aux.charAt(i) + "." + salida ;
				} else {
					salida = aux.charAt(i) + salida;
				}
				posicion += 1;
			}
			System.out.println(salida);
		}
		entrada.close();
	}
}
