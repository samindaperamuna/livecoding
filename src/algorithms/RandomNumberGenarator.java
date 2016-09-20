package algorithms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Saminda Peramuna (GPLed)
 */
public class RandomNumberGenarator {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter(new File("data"));) {	
			for (int i = 0; i < Math.pow(10, 5); i++) {
				writer.write(Integer.toString((int)(ThreadLocalRandom.current().nextInt( (int)Math.pow(-10, 9), (int)Math.pow(10, 9)))) + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
