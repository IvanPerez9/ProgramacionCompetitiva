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
public class Problema434 {

	/*
	 * Acepta el reto 434 - Romance en el palomar
	 */
	
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)) {
			int num = entrada.nextInt();
			for (int i = 0; i < num; i++) {
				int palomas = entrada.nextInt();
				int cajas = entrada.nextInt();
				
				if (palomas < cajas) {
					System.out.println("ROMANCE");
				} else if (palomas == cajas) {
					System.out.println("ROMANCE");
				} else {
					System.out.println("PRINCIPIO");
				}
			}
		} catch (Exception e) {
			System.out.println("Error en la lectura, ");
			e.printStackTrace();
		}
		
	}
}
