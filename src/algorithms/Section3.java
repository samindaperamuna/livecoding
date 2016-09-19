package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Section3 {
	private static final int N = 100;
	private static final File fileIn = new File("in");
	private static final File fileOut = new File("out");
	private static int a[] = new int[N];

	public static void main(String[] args) {
		try (Scanner in = new Scanner(fileIn)) {
			for (int i = 0; i < N; i++) {
				a[i] = in.nextInt();  
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getStackTrace());
		}
		
		add(50, 60, 100);
		
		try (FileWriter writer = new FileWriter(fileOut)) {
			for (int num : a) {
				writer.write(Integer.toString(num) + " ");
			}
		} catch (IOException e) {
			System.err.println(e.getStackTrace());
		}
	}

	/***
	 * Complexity 
	 * 
	 * Best case when left = right which is O(N)
	 * Worst case when left = 1 and right = N;
	 */
	private static void add(int left, int right, int incr) {
		for (int i = left; i <= right; i++) {
			a[i] += incr;
		} 
	}
}
