package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileUtils {

	public static void create(String name, String text) {
		name = name.toLowerCase().trim();
		File file = new File("10-" +name+".tex");
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
	

	public static void clean() {
		File[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File(System.getProperty("user.dir"));

        // Populates the array with names of files and directories
        pathnames = f.listFiles();

        for (File file : pathnames) {

        	if(file.getName().contains(".tex") || file.getName().contains(".pdf") || file.getName().contains(".log") || 
        			file.getName().contains(".aux") || file.getName().contains("synctex.gz")){
        		file.delete();
        		System.out.println("Delete " + file.getName());
        	}
            
        }
	}
}
