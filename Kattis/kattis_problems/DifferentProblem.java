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
public class DifferentProblem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			System.out.println(Math.abs(n1 - n2));
		}
		scanner.close();
	}
}
