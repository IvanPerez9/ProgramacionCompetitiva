/**
 * 
 */
package intervalo500_599;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ivan
 *
 *         https://github.com/IvanPerez9
 * 
 *         Acepta el Reto 533 - La botella ganadora
 */
public class Problema533 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numCasos = entrada.nextInt();

		for (int i = 0; i < numCasos; i++) {
			calculoKilosBotellas(entrada);
		}
		entrada.close();
		
	}

	public static void calculoKilosBotellas(Scanner entrada) {
		// 1 kilo son 8 botellas
		int kilos = entrada.nextInt() * 8;
		// Almaceno la linea entera de botellas
		entrada.nextLine();
		String linea = entrada.nextLine();
		String[] botellas = linea.split(" ");
		int sumatorio = 0;
		for (int j = 0; j < botellas.length; j++) {
			if (Integer.parseInt(botellas[j]) + sumatorio >= kilos) {
				System.out.println(j + 1);
				return;
			} else {
				sumatorio += Integer.parseInt(botellas[j]);
			}
		}
		System.out.println("SIGAMOS RECICLANDO");
	}

}
