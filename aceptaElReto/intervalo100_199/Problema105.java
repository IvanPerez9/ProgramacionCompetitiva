/**
 * 
 */
package intervalo100_199;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema105 {
	
	/*
	 * 105 - Ventas
	 */
	
	public static void main(String[] args) {
		
		/*
	     *  Le gustaría saber qué día de la semana se producen el mayor y el menor número de ventas
	     *  y si las ventas del domingo superan a la media semanal.
	     *  Lunes descansa.
	     *  
	     *  Recibe el valor de una semana, termina cuando -1
	     *  
	     *  Conteniendo dos días de la semana (MARTES, MIERCOLES, JUEVES, VIERNES, SABADO o DOMINGO).
	     *  El primero indicará el día de más ventas y el segundo el de menos
	     *  
	     *  Después se indicará un SI si el domingo se realizaron más ventas que la media semanal,
	     *  y NO en caso contrario. Las tres palabras se separarán entre ellas por un espacio.
	     *  Si hay empate de cifras se pone EMPATE.
	     */
	    
	    @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US); // Usar el punto como decimal
	    String[] days = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES" , "SABADO", "DOMINGO"};
	    StringBuilder salida = new StringBuilder(); // Presentar todo al final
	    
	    float media = 0;
	    float maximo = 0;
	    float minimo = 0;
	    int menosVentas = 0; // Dia posicion
	    int masVentas =0; // Dia posicion
	    double n;
	    int contador = 0;
	    
	    while ((n = entrada.nextDouble()) != -1) {
	    	float num = (float) n;
	    	if (contador == 0) {
	    		maximo = num;
	    		masVentas = 0;
	    		minimo = num;
	    		menosVentas = 0;
	    	} else {
	    		if (num > maximo) {
	    			maximo = num;
	    			masVentas = contador;
	    		} else if ( num < minimo) {
	    			minimo = num;
	    			menosVentas = contador;
	    		}
	    	}
	    	media += num;
	    	
	    	// Final -> 5 dias
	    	
	    	if (contador == 5) {
	    		if (menosVentas == masVentas) {
	    			//System.out.print("EMPATE ");
	    			salida.append("EMPATE\n");
	    		} else {
	    			salida.append(days[masVentas]+ " ");
	    			salida.append(days[menosVentas]+ " ");
	    			float average = (media / (contador+1) ) ;
	    			if (num > average) {
	    				//System.out.print("SI");
	    				salida.append("SI\n");
	    			} else {
	    				//System.out.println("NO");
	    				salida.append("NO\n");
	    			}
	    		}
	    		contador = 0;
	    		media = 0;
	    	} else {
	    		contador ++;
	    	}
	    }
	    System.out.println(salida.toString());
	    entrada.close();
	}
	
}
