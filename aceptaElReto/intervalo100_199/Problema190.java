/**
 * 
 */
package intervalo100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Ivan.Perez
 *
 *         https://github.com/IvanPerez9
 */
public class Problema190 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer token;

	public static void main(String[] args) throws IOException {
		while (true) {
			token = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(token.nextToken());
			int den = Integer.parseInt(token.nextToken());
			if (den > num) {
				break;
			}
			long res = 1;
			for (int i = den + 1; i <= num; i++) {
				res *= i;
			}
			System.out.println(res);
		}
	}
}
