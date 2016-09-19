package algorithms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Saminda Peramuna (GPLed)
 */
public class RandomNumberGenarator {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter(new File("data"));) {	
			for (int i = 0; i < 100; i++) {
				writer.write(Integer.toString((int)(Math.random() * 100)) + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
