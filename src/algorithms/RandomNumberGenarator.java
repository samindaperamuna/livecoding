package algorithms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RandomNumberGenarator {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter(new File("data"));) {	
			for (int i = 0; i < 100; i++) {
				writer.write((int) (Math.random() * 10));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
