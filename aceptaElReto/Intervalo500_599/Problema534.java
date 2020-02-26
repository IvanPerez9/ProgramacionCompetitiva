/**
 * 
 */
package Intervalo500_599;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema534 {

	/*
	 * Acepta el reto 534
	 * Tras el festival
	 */
	
	public static void main(String[] args) {
		
		
		
		try(Scanner entrada = new Scanner(System.in) ) { // Asi no hace falta el .close
			while (true) {
				int n = entrada.nextInt();
				if (n == 0) {
					break;
				}
				ArrayList<Integer> cubos = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					cubos.add(entrada.nextInt());
				}
				Collections.sort(cubos);
				int ret = 0;
				for (int y = 0; y < n -1; y+=2) {
					ret = Math.max(ret, Math.abs(cubos.get(y) - cubos.get(y+1)));
				}
				System.out.println(ret);
			}
		}
	}
}
