/**
 * 
 */
package intervalo200_299;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema208 {

	/*
	 * Acepta el Reto 208 - Tirando bolos
	 */
	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int filas = entrada.nextInt();
			int bolo = entrada.nextInt();
			while (filas != 0 && bolo != 0) {
				int total = (filas * (filas + 1)) / 2;
				int caidos = (filas - bolo + 1) * (filas - bolo + 2) / 2;
				System.out.println(total - caidos);
				filas = entrada.nextInt();
				bolo = entrada.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		
	}
}
