/**
 * 
 */
package SPOJ;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Ivan.Perez
 *
 *  https://github.com/IvanPerez9
 */
public class Stamps {

	/*
     * SPOJ : Stamps
     */
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            int total = entrada.nextInt();
            int p = entrada.nextInt();
            Integer[] array = new Integer[p] ;
            for (int j = 0; j < p; j++) {
                array[j] = entrada.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());
            int contador = 0;
            int suma = 0;
            while ((suma < total) && (contador < array.length)) {
                suma += array[contador];
                contador ++;
            }
            System.out.println("Scenario #"+i);
            if (contador == array.length) {
                System.out.println("imposible");
            }else {
                System.out.println(contador);
            }
            System.out.println();
        }
        entrada.close();
    }
	
}
