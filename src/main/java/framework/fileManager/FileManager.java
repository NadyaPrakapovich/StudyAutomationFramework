package framework.fileManager;

import utility.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.UUID;

public class FileManager {

	public static File createFile()  {

		String text = "Hello world!";
		String fileName = generationNameFile() + ".txt";
		System.out.println(fileName);
		File file = new File(fileName);
		try {
			file.createNewFile();
			FileWriter writer;
			writer = new FileWriter(fileName);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			Logger.getLogger().error("File is not created",e);
		}
		return file;
	}


	public static String generationNameFile() {
	  String filename=(UUID.randomUUID().toString().substring(0, 5));
		return filename;
	}


}



