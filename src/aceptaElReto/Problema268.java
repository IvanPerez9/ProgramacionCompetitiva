/**
 * 
 */
package aceptaElReto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema268 {
	
	/* 
     * Acepta el reto 268
     * 
     * 2 3
     * 34 48
     * 20 26 34
     * 1 4
     * 44
     * 28 24 20 16
     * 0 0
     * 
     * TODO : Mostrarlo 
     * 
     */

    @SuppressWarnings("unchecked")
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int nPlatos = Integer.parseInt(entrada.next());
      int nCoronas = Integer.parseInt(entrada.next());
      
      while (nPlatos != 0 && nCoronas != 0) {
        
        StringBuilder sb = new StringBuilder();
        
        double[] platos = new double[nPlatos];
        for (int i = 0; i < nPlatos; i++) {
          platos[i] = Integer.parseInt(entrada.next());
        }
        
        double[] coronas = new double[nCoronas];
        for (int i = 0; i < nCoronas; i++) {
          coronas[i] = Integer.parseInt(entrada.next());
        }
        
        //Ordenarlos TODO
        Map<String, Double> mapa = new HashMap<>();
        for (double i : coronas) {
      for (double j : platos) {
        String mostrar = (int)j +"-"+(int)i;
        double valor = j/i;
        mapa.put(mostrar, valor);
      }
        }
        //mapa.entrySet()
        //.stream()
        //.sorted(Map.Entry.comparingByValue())
        //.forEach(System.out::print);
        
        Object[] a = mapa.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Double>) o1).getValue().compareTo(((Map.Entry<String, Double>) o2).getValue());
            }
        });
        int contador = 0;
        for (Object e : a) {
          System.out.print(((Map.Entry<String, Double>) e).getKey() + " ");
        }
        System.out.println();
        // Actualizacion
        nPlatos = Integer.parseInt(entrada.next());
        nCoronas = Integer.parseInt(entrada.next());
      }
      entrada.close();
    }
}
