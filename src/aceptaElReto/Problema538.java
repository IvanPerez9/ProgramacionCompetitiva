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
public class Problema538 {

	/*
	 * Acepta el reto 538
	 */
	
	public static final String SENIL = "SENIL";
	public static final String CUERDO = "CUERDO";
	
	public static void main(String[] args) {
		
		try(Scanner entrada = new Scanner(System.in)){
			while(entrada.hasNext()) {
				int abu = entrada.nextInt();
				int iglesia = entrada.nextInt();
				if (iglesia == 0 && abu == 0) {
					break;
				}
				System.out.println((iglesia > abu) ? SENIL : CUERDO);
			}
		}
	}
}
