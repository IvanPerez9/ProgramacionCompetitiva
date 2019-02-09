/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema370 {

	/*
	 * La 13-14 
	 * Llaves que existen tienen en cada extremo calibres consecutivos, siendo el menor de ellos par.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num = Integer.parseInt(entrada.nextLine());
		boolean condicion = false;
		
		for (int i = 0; i < num; i++) {
			String[] linea = entrada.nextLine().split("-");
			
			int extremo1 = Integer.parseInt(linea[0]);
			int extremo2 = Integer.parseInt(linea[1]);
			
			if (extremo1 == (extremo2 -1)) {
				condicion = extremo1 % 2 == 0;

			} else if (extremo2 == extremo1 -1) {
				condicion = extremo2 % 2 == 0;
			}
			System.out.println(condicion ? "SI" : "NO");
		}
	}
}