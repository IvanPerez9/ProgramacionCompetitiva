package intervalo600_699;

import java.util.Scanner;

public class Problema621 {

	/**
	 * Acepta el reto 621 - La otra página
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numCasos = entrada.nextInt();
		int sigPag = 0;
		
		for (int i = 0; i < numCasos; i++) {
			sigPag = entrada.nextInt();
			System.out.println(((sigPag % 2) == 0) ? ++sigPag : --sigPag);
		}
		entrada.close();
	}
	
}
