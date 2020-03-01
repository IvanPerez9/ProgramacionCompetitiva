/**
 * 
 */
package intervalo100_199;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema185 {

	/* Acepta el reto 185
	   * 
	   * Potitos
	   * 
	   * hasmap con cada ingrediente si o no
	   * 
	   * SI: patata maiz tomate FIN
	   * 
	   * 
	   * TODO
	   */
	
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int num = entrada.nextInt();
	    LinkedList<String> conjuntoSI = new LinkedList<>();  
	    LinkedList<String> conjuntoNO = new LinkedList<>();
	    
	    while (num != 0) {
	      for (int i = 0; i < num; i++) {
	        String gustar = entrada.next();
	        String ingrediente = entrada.next();
	        if (gustar.equals("SI:")) {
	          while (!ingrediente.equals("FIN")) {
	            conjuntoSI.add(ingrediente);
	            for (int j = 0; j < conjuntoNO.size(); j++) {
	              if (conjuntoNO.get(j).equals(ingrediente)) {
	                conjuntoNO.remove(j);
	              }
	            }
	            ingrediente = entrada.next();
	          }  
	        }else {
	          while (!ingrediente.equals("FIN")) {
	            boolean estaLista = false;
	            boolean estaListaAux = false;
	            
	            for (String s : conjuntoSI) {
	              if (s.equals(ingrediente)) {
	                estaLista = true;
	              }
	            }
	            
	            for (String s : conjuntoNO) {
	              if (s.equals(ingrediente)) {
	                estaListaAux = true;
	              }
	            }
	            
	            if (!estaLista && !estaListaAux) {
	              conjuntoNO.add(ingrediente);
	            }
	            
	            ingrediente = entrada.next();
	          }
	        }
	      }
	      Collections.sort(conjuntoNO);
	      StringBuilder sb = new StringBuilder();
	      for (String aux : conjuntoNO)
	        sb.append(aux + " ");
	      // Borro el ultimo espacio en blanco
	      if (sb.length() > 0)
	        sb.delete(sb.length() - 1, sb.length());
	      String salida = sb.toString();
	      System.out.println(salida);
	      
	      conjuntoNO.clear();
	      conjuntoSI.clear();
	      num = entrada.nextInt();
	    }
	    entrada.close();
	  }
	}