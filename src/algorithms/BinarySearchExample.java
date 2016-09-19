package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

public class BinarySearchExample {
	private static final String CLOSE_FLAGS = "Q QUIT EXIT";
	private static final int N = 100;
	private static final File FILE_IN = new File("in");

	private static int a[] = new int[N];

	public static void main(String[] args) {
		try (Scanner in = new Scanner(FILE_IN)) {
			for (int i = 0; i < N; i++) {
				a[i] = in.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getStackTrace());
		}
		
		System.out.println("Please enter a number to search for.\n");
		
		try (Scanner in = new Scanner(System.in)) {
			String feed = "";
			while (!CLOSE_FLAGS.contains(feed.toUpperCase())) {
				feed = in.nextLine();
				
				if (NumberUtils.isNumber(feed)) {
					
				} else {
					System.out.println("Please enter a number to search for.");
				}
			}
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
	}
}
