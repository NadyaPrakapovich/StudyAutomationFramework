package framework.fileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

public  class FileManager {
	private static SecureRandom random = new SecureRandom();

	public static File  createFile() throws IOException {

		String text = "Hello world!";
		String fileName = generationNameFile()+".txt";
		System.out.println(fileName);
		File file = new File(fileName);
		try {
			file.createNewFile();
			FileWriter writer;
			writer = new FileWriter(fileName);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.getMessage();
		}
		return file;
	}



	public static String generationNameFile() {
 		String fileName=new BigInteger(130, random).toString(32);
		return fileName.substring(0,5);

	}


}


