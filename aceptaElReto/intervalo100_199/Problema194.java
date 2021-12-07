/**
 * 
 */
package intervalo100_199;

import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class Problema194 {
	
	/*
	 * Acepta el reto 194 - Salvemos al lince iberico
	 */

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			int numCasos = entrada.nextInt();
			for(int i=0; i<numCasos; i++){
				String descripcion = entrada.next();
				int cont = 0;
				int j = 0;
				while(j<descripcion.length()){
					if(descripcion.charAt(j)=='.'){
						cont++;
						j+=3;
					}
					else{
						j++;
					}
				}
				System.out.println(cont);
			}
			
		} catch (Exception e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		
	}
}
