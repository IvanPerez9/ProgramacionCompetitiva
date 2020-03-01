/**
 * 
 */
package intervalo300_399;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema321 {

	/*
	 * Acepta el reto 321 - Double decker
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int autobuses = entrada.nextInt();
		
		for (int i = 0; i < autobuses; i++) {
			int personas = 1;
			int n = entrada.nextInt(); // Personas superior
			int m = entrada.nextInt(); // Personas inferior
			
			for (int j = 0; j < n; j++) {
				personas++;
				m++;
			}
			while(m > 0) {
				personas += m;
				m--;
			}
			System.out.println(personas);
		}
		entrada.close();
	}
}
