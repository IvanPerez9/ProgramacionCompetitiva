/**
 * 
 */
package adaByron2021_Entrenamiento1;

import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class DuracionDeBombillasLED {
	
	/*
	 * AdaByron 2021 - Entrenamiento 2
	 * 
	 * Duración de bombillas LED - Acepta el reto 584
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numCasos = entrada.nextInt();
		int numHorasAguanta, numEncendidos, numHorasEncendida;
		
		for (int i = 0; i < numCasos; i++) {
			numHorasAguanta = entrada.nextInt();
			numEncendidos = entrada.nextInt();
			numHorasEncendida = entrada.nextInt();
			
			if ((numEncendidos * numHorasEncendida >= numHorasAguanta) && (numHorasAguanta / numEncendidos == numHorasEncendida))
                System.out.println("AMBAS");
            else if (numEncendidos * numHorasEncendida >= numHorasAguanta)
                System.out.println("HORAS");
            else System.out.println("ENCENDIDOS");
		}
		entrada.close();
	}

}
