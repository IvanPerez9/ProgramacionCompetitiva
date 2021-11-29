/**
 * 
 */
package intervalo400_499;

import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class Problema402 {
	
	/*
	 * Acepta el reto 402 - Las dimensiones del puzzle
	 */
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int numPiezas;
			while((numPiezas = entrada.nextInt()) != 0) {
				int raiz = (int) Math.sqrt(numPiezas);
				while(numPiezas % raiz != 0) {
					raiz--;
				}
				System.out.println(numPiezas / raiz);
			}
			
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	}

}
