/**
 * 
 */
package kattis_problems;

import java.util.Scanner;

/**
 * @author ivan
 *
 *  https://github.com/IvanPerez9
 */
public class Filip {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		int rn1 = reverseNumber(n1);
		int rn2 = reverseNumber(n2);
		
		System.out.println(rn1>rn2 ? rn1 : rn2);
		entrada.close();
		
	}
	
	public static int reverseNumber (int number) {
		int reverse = 0;
		while(number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		return reverse;
	}

}
