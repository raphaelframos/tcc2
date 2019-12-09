package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileUtils {

	public static void create(String name, String text) {
		String title = name.split(" ")[0];
		File file = new File(title+".tex");
        try {
        	file.createNewFile();
        	write(file, text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void write(File file, String text) throws FileNotFoundException {
		try (PrintStream out = new PrintStream(new FileOutputStream(file))) {
		    out.print(text);
		}
	}
}
