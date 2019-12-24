package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextUtils {
	
	private static BufferedReader openFile(String name) throws FileNotFoundException{
		File f = new File(name);
        BufferedReader b = new BufferedReader(new FileReader(f));
        return b;
	}
	
	private static String writeText(BufferedReader b) throws IOException{
		StringBuilder text = new StringBuilder();
		String readLine = "";

        
        while ((readLine = b.readLine()) != null) {
            text.append(readLine);
            text.append("\n");
        }
        b.close();
        return text.toString();
	}
	
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
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		return text.toString();
	}

	public static String createHeader() {
		StringBuilder text = new StringBuilder();
		try {

            File f = new File("cabecalho.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            
            while ((readLine = b.readLine()) != null) {
                text.append(readLine);
                text.append("\n");
            }
            b.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		return text.toString();
	}

	public static String createPartOne() {
		try {
			return writeText(openFile("part_one.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String createPartTwo() {
		try {
			return writeText(openFile("part_two.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String createPartThree() {
		try {
			return writeText(openFile("part_three.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartFour() {
		try {
			return writeText(openFile("part_four.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartFive() {
		try {
			return writeText(openFile("part_five.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartSix() {
		try {
			return writeText(openFile("part_six.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartSeven() {
		try {
			return writeText(openFile("part_seven.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartEight() {
		try {
			return writeText(openFile("part_eight.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartNine() {
		try {
			return writeText(openFile("part_nine.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String createPartTen() {
		try {
			return writeText(openFile("part_ten.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
