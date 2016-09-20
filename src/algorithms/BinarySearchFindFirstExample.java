package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

public class BinarySearchFindFirstExample {
	private static final int N = (int) Math.pow(10, 5);
	private static final File FILE_IN = new File("in");
	private static final String CLOSE_FLAGS = "Q";

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
			feed = in.nextLine();
			
			while (!CLOSE_FLAGS.equals(feed.toUpperCase())) {
				
				if (NumberUtils.isNumber(feed)) {
					int index = binarySearch(Integer.parseInt(feed));
					if (index >= 0) {
						System.out.println("The first occurence of the number is at index : " + index + "\n");
					} else {
						System.out.println("The number is not in this array\n");
					}
				} else {
					System.out.println("Please enter a number to search for.");
				}
				
				feed = in.nextLine();
			}
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
		
		System.out.println("Bye!\n");
	}
	
	/*
	 * Complexity of binary search is log(2) N.
	 */
	private static int binarySearch(int number) {
		int result = -1;
		int left = 1;
		int right = a.length;
		
		while(left <= right) {
			int mid = (left + right) / 2 ;
			
			if (number == a[mid]) {
				result = mid;
				right = mid - 1;
			} else if (number < a[mid]){
				right = mid - 1;
			} else {
				left = mid + 1; 
			}
		} 
		
		return result;
	}
}
