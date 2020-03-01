/**
 * 
 */
package intervalo200_299;

import java.io.IOException;
import java.util.Scanner;
/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */

public class Problema239 {
  
  /* 
     * 239 - Pi. Pi. Pi. Pi. Pi. Piiiii
     */

  public static void main(String[] args) throws IOException {

    /*
     * D:HH:MM:SS  Siempre 2 digitos
     * HH <= 23
     * MM y SS <= 59
     * D < 1000 (Solo un digito)
     */
    
    Scanner entrada = new Scanner(System.in);
    int dias,horas,minutos,segundos;
    
    while (true) {
      Integer numeroPitidos = entrada.nextInt();
      Integer numeroEmisoras = entrada.nextInt();
      if (numeroPitidos == 0 && numeroEmisoras == 0) {
        break;
      }
      segundos = (numeroPitidos * numeroEmisoras) * (24*6);  // Toal de veces en segundos
      
      // MOD y DIV para calcular
      dias = segundos / 86400;
      segundos %= 86400;
      horas = segundos / 3600;
      segundos %= 3600;
      minutos = segundos / 60;
      segundos %= 60;
      
      System.out.printf("%d:%02d:%02d:%02d\n" , dias, horas, minutos, segundos);
    }
    entrada.close();
  }
}
