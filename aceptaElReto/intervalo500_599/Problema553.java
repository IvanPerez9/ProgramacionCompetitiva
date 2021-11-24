/**
 * 
 */
package intervalo500_599;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 */
public class Problema553 {

	/*
	 * AdaByron 2021 - Entrenamiento 3
	 * 
	 * Traduciendo los apuntes - Acepta el reto 553
	 */
	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			List<Integer> pags = new ArrayList<Integer>();
			int numeroProfesores, maximo, pagTraducidas, rangoMin, rangoMax;
			numeroProfesores = entrada.nextInt();
			while (numeroProfesores != 0) {
				for (int i = 0; i < numeroProfesores * 2; i++) {
					pags.add(entrada.nextInt());
				}
				maximo = Collections.max(pags);
				int[] array = new int[maximo + 1];
				pagTraducidas = 0;

				while (!pags.isEmpty()) {
					rangoMin = pags.get(0);
					rangoMax = pags.get(1);
					pags.remove(1);
					pags.remove(0);
					pagTraducidas += contarTraducidad(rangoMin, rangoMax, array);
				}
				System.out.println(pagTraducidas + (numeroProfesores - 1));

				numeroProfesores = entrada.nextInt();
			}

		} catch (Exception e) {
			System.out.println("Error al lerr");
			e.printStackTrace();
		}
	}

	/**
	 * Marco las hojas traducidas y devuelvo en numero de marcadas
	 * 
	 * @param rangoMin
	 * @param rangoMax
	 * @param array
	 * @return
	 */
	public static int contarTraducidad(int rangoMin, int rangoMax, int[] array) {
		int hojasTraducidad = 0;

		// Check size
		if (rangoMax > array.length) {
			System.out.println("Revisar tamaño array");
		}

		// Marco con un "2" = "Traducido" las hojas
		for (int i = rangoMin; i < rangoMax; i++) {
			if (array[i] != 2) {
				array[i] = 2;
				hojasTraducidad++;
			}
		}

		return hojasTraducidad;
	}

}
