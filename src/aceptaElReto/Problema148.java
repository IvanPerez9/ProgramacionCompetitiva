/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @date 30 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema148 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String linea = entrada.nextLine();
		String [] aux = new String [20];
		
		int horas, min, resultado = 0;
		
		while(!linea.equals("00:00")) {
			
			aux = linea.split(":");
			horas = Integer.parseInt(aux[0]);
			min = Integer.parseInt(aux[1]);
			
			resultado = ((23-horas)*60 + (60 - min));
			System.out.println(resultado);
			linea = entrada.nextLine();
		}
		entrada.close();
	}
}
