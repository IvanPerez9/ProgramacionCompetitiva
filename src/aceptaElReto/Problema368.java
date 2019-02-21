/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Problema368 {

	/* 
     * Acepta el reto 368
     * 
     * 3 5
     * 5 5
     * 6 5
     * 0 0
     * 
     * La olla son 10 min
     * 
     */

  
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    double nHuevos = entrada.nextInt();
    double nOlla = entrada.nextInt();
    double salida = 0;
    
    while (nHuevos != 0 && nOlla != 0) {
      if (nHuevos < nOlla) {
        salida = 10;
      } else {
        double division = nHuevos / nOlla ;
        salida = ((10 * Math.ceil(division)));
      }
      System.out.println((int)salida);
      
      nHuevos = entrada.nextInt();
      nOlla = entrada.nextInt();
    }
    entrada.close();
  }
}
