/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema103 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String grado ;
		
		while (!(grado = entrada.nextLine()).equals("20"))  {
			int gradoIn = Integer.parseInt(grado);
			String[] coeficientes = entrada.nextLine().split(" ");
			int rectangulos = Integer.parseInt(entrada.nextLine());
			if (rectangulos > 1000) {
				rectangulos = 1000;
			}
			
			// ∑i=0n−11n⋅f(i⋅1n)

			double area = 0;
			for (int i = 0; i < rectangulos; i++) {
				double aux = 0;
				for (int j = 0; j < coeficientes.length - 1; j++) {
					aux += Float.parseFloat(coeficientes[j]) * Math.pow((float) i / rectangulos, gradoIn - j);
				}
				//Termino independiente
				aux += Float.parseFloat(coeficientes[coeficientes.length - 1]);
				
				// Si sobrepaso la hectarea, area = area + 1
				if (aux > 1) {
					area++; 
				} else if (aux > 0) {
					area += aux;
				}
			}
			area /= rectangulos; // Si no siempre se la da a cain, no divides entre los rectangulos
			double diferencia = area - (1 - area);
			if (Math.abs(diferencia) <= 0.001) {
				System.out.println("JUSTO");
			} else if (diferencia > 0) {
				System.out.println("CAIN");
			} else {
				System.out.println("ABEL");
			}
		}
		entrada.close();
	}
	
}
