/**
 * 
 */
package Intervalo100_199;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema106 {

		/* 
	     * Acepta el reto 106
	     * 
	     * Numero de 8 digitos o de 13. Si no llega a 8 o 13 rellenar con 0 por la izquierda
	     * 
	     * Comprobar que el numero de control (El de más a la derecha) es el correspondiente
	     * Para ello, los digitos impares se multiplican por 3 y los pares por 1 -> Luego se suma
	     * 
	     */

  
	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    String n = entrada.nextLine();
	    
	    while (!n.equals("0")) {
	      StringBuilder salida = new StringBuilder(10000);
	      StringBuilder codigo = new StringBuilder(n); // Usar Stringbuilder con String 
	      if (codigo.length() < 8) {
	        rellenarCodigo (codigo, 8);
	      } else if ((codigo.length() > 8) && (codigo.length() < 13)) {
	        rellenarCodigo (codigo, 13);
	      }
	      
	      String codigoString = codigo.toString();
	      
	      if (validarCodigo(codigoString)) {
	        salida.append("SI");
	        if (codigo.length() == 13) {
	          salida.append(' ').append(paisCodigo(codigoString)); // Dejo un espacio y pongo el pais
	        }
	      } else {
	        salida.append("NO");
	      }
	      System.out.println(salida);
	      n = entrada.next();
	    }
	    entrada.close();
	  }
  
	  public static void rellenarCodigo (StringBuilder codigo , int capacidad) {
	    while (codigo.length() < capacidad) {
	      codigo.insert(0, '0'); // Insertar en la primera posicion ceros
	    }
	  }
	  
	  public static String paisCodigo (String codigo) {
	    if (codigo.startsWith("0")) {
	      return "EEUU";
	    }
	    if (codigo.startsWith("380")) {
	      return "Bulgaria";
	    }
	    if (codigo.startsWith("50")) {
	      return "Inglaterra";
	    }
	    if (codigo.startsWith("539")) {
	      return "Irlanda";
	    }
	    if (codigo.startsWith("560")) {
	      return "Portugal";
	    }
	    if (codigo.startsWith("70")) {
	      return "Noruega";
	    }
	    if (codigo.startsWith("759")) {
	      return "Venezuela";
	    }
	    if (codigo.startsWith("850")) {
	      return "Cuba";
	    }
	    if (codigo.startsWith("890")) {
	      return "India";
	    }
	    return "Desconocido";
	  }
	  
	  public static boolean validarCodigo (String codigo) {
		    int aux = 0;
		    boolean par = false;
		    // Recorro de derecha a izquierda
		    for (int i = codigo.length() - 2; i >= 0; i--) {
		    	int digito = Character.getNumericValue(codigo.charAt(i));
			    aux += par ? digito : digito * 3;
			    par = !par;
		    }
		    // Compruebo si el resultado es modulo de 10 
		    return (aux + Character.getNumericValue(codigo.charAt(codigo.length() - 1))) % 10 == 0;
	  }
	
}
