/**
 * 
 */
package Intervalo100_199;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @date 31 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema141 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    while (entrada.hasNextLine()) {
	              String s = entrada.nextLine();
	              boolean balanceado = balanceados(s);
	              System.out.println(balanceado ? "YES" : "NO");
	    }
	    entrada.close();
	}
	  
	public static boolean balanceados (String linea) {

	   String abre   = "{[(";
	   String cierra = "}])"; 
	    
	   Deque <Character> pila = new ArrayDeque<Character>();
	   boolean condicion = true;
	   int i = 0;
	   
	   //Ojo poner condicion en el bucle tambien, en cuando tenga 1 desbalanceado
	   
	   while (condicion && i < linea.length()) {
	     char c = linea.charAt(i);
	           if (abre.indexOf(c)>=0) { 
	               pila.addFirst(c);     
	           } else if (cierra.indexOf(c)>=0) { 
	               int pos = cierra.indexOf(c);
	               if (pila.isEmpty()) {  
	                   condicion = false;
	               } else {
	                   condicion = (pila.removeFirst() == abre.charAt(pos)); 
	               }
	           }
	      i++;
	   }
	   return condicion && pila.isEmpty();
	 }
}