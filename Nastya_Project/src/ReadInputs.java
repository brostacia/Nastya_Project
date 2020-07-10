
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadInputs {
	
	public static void main(String[] args) {
		
		//ArrayList<String> homographs = new ArrayList<String>();
		File file = new File("Nastya_Project/src/file.txt");
		try (FileReader fileReader = new FileReader(file)) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				Token tokens [] = Tokenizer.tokenize(line);
				for (int i=0; i<tokens.length; i++) {
					for(int j=0; j<Homonyms.PARADIGMATIC.length; j++) {
						if (tokens[i].text.equals(Homonyms.PARADIGMATIC[j])) {
							//homographs.add(tokens[i].text); // омограф
							int count = 1;
							while (tokens[i-count].type != Token.Type.CYRIL && i>=0) {
										count++;							
									}
							System.out.println(tokens[i-count]);	
							}
						}
					}
			}
				//System.out.println(homographs);
			//	System.out.println(Arrays.toString(tokens));
		} catch (Exception e) {
		}
		
	}
}

