package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Implementing Counting Sort using Java
 * 
 * @author Saminda Peramuna (GPLed)
 */
public class CountingSortExample {
	// Number of elements
	private static final int N = (int)Math.pow(10, 9);
	// Appearance array
	private static int a[] = new int[N];

	public static void main(String[] args) {
		File fileIn = new File("in");
		File fileOut = new File("out");

		int max = 0;

		try (Scanner in = new Scanner(fileIn);) {
			for (int i = 0; i < N; i++) {
				int num = in.nextInt();
				++a[num];
				max = Math.max(max, num);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getStackTrace());
		}
		try (FileWriter writer = new FileWriter(fileOut);) {
			for (int i = 0; i <= max; i++) {
				if (a[i] > 0) {
					for (int j = 1; j <= a[i]; j++) {
						writer.write(Integer.toString(i) + " ");
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
	}
}
