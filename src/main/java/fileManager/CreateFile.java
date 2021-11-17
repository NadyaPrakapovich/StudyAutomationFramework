package fileManager;

import net.bytebuddy.utility.RandomString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public  class CreateFile {
	private static SecureRandom random = new SecureRandom();

	public static File  createFile() throws IOException {

		String text = "Hello world!";

		//String fileName = (new RandomString(5, ThreadLocalRandom.current()).nextString() + ".txt");
		String fileName = generationNameFile()+".txt";
		System.out.println(fileName);
		File file = new File(fileName);
		try {
			file.createNewFile();
			FileWriter writer = null;
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



