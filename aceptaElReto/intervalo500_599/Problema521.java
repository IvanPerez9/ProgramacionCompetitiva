package intervalo500_599;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problema521 {
	
	static final String EMPEZAMOS = "EMPEZAMOS" ;
	static final String ESPERAMOS = "ESPERAMOS" ;

	/*
	 * Acepta el reto 521
	 *  
	 * ¿Podemos empezar? :
	 * Numero de Pisos, numero de letas, numeros de asistentes
	 * 1 persona de la mitad de las viviendas
	 * 
	 * Stop: 0 0 0
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    int numPisos = entrada.nextInt();
	    int numLetras = entrada.nextInt();
	    int numAsistentes = entrada.nextInt();
	    
	    while (numPisos != 0 && numLetras != 0 && numAsistentes != 0) {
	    	int viviendas = numPisos * numLetras;
	    	Set<String> asistentes = new HashSet<>();
	    	String piso = "";
	    	String letra = "";
	    	for (int i = 0; i < numAsistentes; i++) {
				piso = entrada.next(); 
				letra = entrada.next();
				// Conjunto no admite duplicados
				asistentes.add(piso+letra);
			}
	    	
	    	// 1 persona de la mitad de las viviendas
	    	if (asistentes.size() >= Math.ceil((double)viviendas/2)) {
	    		System.out.println(EMPEZAMOS);
	    	} else {
	    		System.out.println(ESPERAMOS);
	    	}
	    	numPisos = entrada.nextInt();
		    numLetras = entrada.nextInt();
		    numAsistentes = entrada.nextInt();
	    }
		
	    entrada.close();
	    
	}
	
}
