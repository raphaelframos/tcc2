package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextUtils {
	
	public static String createOneLine(){
		StringBuilder text = new StringBuilder();
		try {

            File f = new File("text_latex.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            
            while ((readLine = b.readLine()) != null) {
                text.append(readLine);
                text.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		return text.toString();
	}

}
