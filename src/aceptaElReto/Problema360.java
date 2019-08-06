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
public class Problema360 {

	/*
	 * Acepta el reto 360 - Rellenando el agua de la fuente
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int contador = 0;
			int ini = entrada.nextInt();
			int min = entrada.nextInt();
			int aux = ini;
			
			while(true) {
				int pierde = entrada.nextInt();
				aux -= pierde;
				if (pierde == -1) {
					break;
				} else if ((aux) < min) {
					contador++;
					aux = ini;
				}
			}
			System.out.println(contador);
		}
		entrada.close();
	}
}
