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
public class Problema245 {

	/*
	 * Acepta el reto 245 - Los Dalton
	 */
	
	public static String des = "DESCONOCIDOS";
	public static String dalton = "DALTON";
	public static int anterior;
	public static int siguiente;
	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			int num = entrada.nextInt();
			while (num != 0 && num >= 2) {
				boolean condicion = true;
				anterior = entrada.nextInt();
				for (int i = 1; i < num && condicion; i++) {
					siguiente = entrada.nextInt();
					if (anterior >= siguiente) {
						condicion = false;
						entrada.nextLine();
					}
					anterior = siguiente;
				}
				System.out.println(condicion ? dalton : des);
				num = entrada.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		
	}
}
