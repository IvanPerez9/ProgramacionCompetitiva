/**
 * 
 */
package intervalo500_599;

import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema502 {

	/*
	 * Acepta el reto 502 - Hoy comemos mejillones
	 */
	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {

			while (entrada.hasNext()) {
				int mejillones = entrada.nextInt();
				int[] montones = new int[mejillones];
				int contador = 1;
				int aux,busqueda;
				montones[0] = entrada.nextInt();
				for (int i = 1; i < mejillones; i++) {
					aux = entrada.nextInt();
					if (aux >= montones[contador - 1]) {
						montones[contador++] = aux;
					} else {
						// Lo puedo añadir a un monton anterior
						busqueda = busquedaBinaria(montones, 0, contador, aux);
						montones[busqueda] = aux;
					}
				}
				System.out.println(contador);
			}

		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}

	/**
	 * Busqueda binaria
	 * @param montones
	 * @param ini
	 * @param top
	 * @param mejillon
	 * @return
	 */
	public static int busquedaBinaria(int[] montones, int ini, int top, int mejillon) {
		int ret = top;
		int mid;
		while (ini < ret) {
			mid = ini + (ret - ini) / 2;
			if (montones[mid] > mejillon) {
				ret = mid;
			} else {
				ini = mid + 1;
			}
		}
		return ret;
	}

}
