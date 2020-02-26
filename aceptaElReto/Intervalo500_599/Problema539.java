/**
 * 
 */
package Intervalo500_599;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema539 {

	/*
	 * Acepta el reto 539
	 */
	
	public static final String ESPERAR = "TOCA ESPERAR";
	public static final String DECADA = "FELIZ DECADA NUEVA";
	
	public static void main(String[] args) {
		
		try(Scanner entrada = new Scanner(System.in)){
			while(entrada.hasNext()) {
				int ini = entrada.nextInt();
				int anno = entrada.nextInt();
				int op = (anno - ini) % 10 ;
				System.out.println((op == 9) ? DECADA : ESPERAR);
			}
		}
	}
}
