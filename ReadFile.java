

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
	private String path;

	public ReadFile(String file_path){
		path = file_path;
	}


	public int readLines() throws IOException{
		FileReader file_to_read = new FileReader(path);
	        BufferedReader bf = new BufferedReader(file_to_read);

		String aLine;
		int numberOfLines = 0;
		while ( ( aLine = bf.readLine( ) ) != null ) {
			numberOfLines++;
		}
		bf.close();
		return numberOfLines;
	}
	public String OpenFile()throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		int numberOfLines = readLines();
		String[ ] textData = new String[numberOfLines];
		int i;
		String sentence="";
		for (i=0; i < numberOfLines; i++) {
			textData[i] = textReader.readLine();
			sentence += textData[i];
		}
		textReader.close();
		return sentence;

	}

}
