/**
 * 
 */
package Intervalo100_199;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @date 25 ene. 2019
 * 
 * @author Iván - IvanPerez9
 *
 */
public class Problema145 {

	static Scanner in;
    public static void caso() {
        String tren = in.nextLine();
        Deque<Character> pilaHombres = new ArrayDeque<>();
        int parejas = 0;
        for (int i = 0; i < tren.length(); i++) {
            char c = tren.charAt(i);
            switch(c) {
                case 'H':
                case 'h':
                    pilaHombres.push(c); // Los hombres van a una pila. Solo se puede emparejar el último
                    break;
                case '@':
                    pilaHombres.clear(); // Los hombres no pueden pasar.
                    break;
                case 'M':
                    if (!pilaHombres.isEmpty()) {
                        if (pilaHombres.pop().equals('H')) { //Si ha llegado un hombre alto
                            parejas++; // se empareja y los otros hombres siguen avanzando
                        } else {
                            pilaHombres.clear(); // Ningun hombre puede avanzar. La pareja los bloquea
                        }
                    }
                    break;
                case 'm': // idem para mujer baja
                    if (!pilaHombres.isEmpty()) {
                        if (pilaHombres.pop().equals('h')) {
                            parejas++;
                        } else {
                            pilaHombres.clear();
                        }
                    }       
            }
        }
        System.out.println(parejas);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        while (in.hasNextLine()) {
            caso();
        }
    }
    
	
}
