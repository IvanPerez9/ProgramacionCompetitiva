/**
 * 
 */
package intervalo300_399;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 * https://github.com/IvanPerez9
 */
public class Problema325 {

	/*
	 * Problema 325 - Helados de cucurucho
	 * 
	 * Todos los chocolates al inicio y todas las vainillas al final
	 */

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int num = entrada.nextInt();
			for (int i = 0; i < num; i++) {
				int chocolate = entrada.nextInt();
				int vainilla = entrada.nextInt();
				StringBuilder ret = new StringBuilder();
				mix(chocolate, vainilla, new StringBuilder(), ret);
				ret.replace(ret.length() - 1, ret.length(), "\n");
				System.out.print(ret);
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}

	private static void mix(int chocolate, int vainilla, StringBuilder sb, StringBuilder ret) {
		if (chocolate + vainilla == 0) {
			ret.append(sb.toString()).append(' ');
		}
		if (chocolate > 0) {
			mix(chocolate - 1, vainilla, sb.append('C'), ret);
			sb.deleteCharAt(sb.length() - 1);
		}
		if (vainilla > 0) {
			mix(chocolate, vainilla - 1, sb.append('V'), ret);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
