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
public class ShatteredCake {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		int area = 0;
		int wi = 0;
		int li = 0;
		for (int i = 0; i < n; i++) {
			wi = scanner.nextInt();
			li = scanner.nextInt();
			area += wi * li;
		}
		System.out.println(area / w);
		scanner.close();
		
	}
	
}
