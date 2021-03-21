/**
 * 
 */
package intervalo400_499;

import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 *  
 *  Acepta el Reto 456 - Tarta Sacher
 *  
 */
public class Problema456 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numCasos = entrada.nextInt();
		int alto = 0;
		int ancho = 0;
		int cuadraditos = 0;
		int area = 0;
		
		while (numCasos > 0) {
			alto = entrada.nextInt();
			ancho = entrada.nextInt();
			cuadraditos = entrada.nextInt();
			
			area = alto * ancho;
			if(area % cuadraditos == 0) {
                System.out.println(cuadraditos/area);
            } else {
                System.out.println((cuadraditos/area)+1);
            }
			numCasos--;
		}
		entrada.close();
	}
	
}
