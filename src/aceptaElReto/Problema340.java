/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema340 {

	/*
	 * Acepta el reto 340 - Cuadrados con cerillas
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		if (n != 0  && n > 0){
			for (int i = 0; i < n; i++) {
				int N = entrada.nextInt();
				int M = entrada.nextInt();
				int ret = ((N+1)*M + (M+1)*N) ;
				System.out.println(ret);
			}
		}
		entrada.close();
	}
}
