/**
 * 
 */
package adaByron2020_Entrenamiento1;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *         https://github.com/IvanPerez9
 */
public class AhorrandoFuerzas {

	public static void main(String[] args) {
		
		int recorrido, posicion, velocidad, nCoches;

		try (Scanner entrada = new Scanner(System.in)) {
			while (entrada.hasNext()) {
				recorrido = entrada.nextInt();
				nCoches = entrada.nextInt();
				int ret = 0;
				for (int i = 0; i < nCoches; i++) {
					posicion = entrada.nextInt();
					velocidad = entrada.nextInt();
					// Calculo lo que tarda en recorrer la distancia
					if (posicion >= 0) {
						ret = (recorrido / velocidad) + posicion;
						ret = Math.min(ret, Integer.MAX_VALUE);
					}
				}
				System.out.println((int) ret);
			}
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}
}
