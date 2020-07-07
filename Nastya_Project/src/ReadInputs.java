
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadInputs {
	
	public static void main(String[] args) {
		
		ArrayList<String> homographs = new ArrayList<String>();
		File file = new File("Nastya_Project/src/file.txt");
		try (FileReader fileReader = new FileReader(file)) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				Token tokens [] = Tokenizer.tokenize(line);
				for (Token t : tokens) {
					for(String h : Homonyms.PARADIGMATIC) {
						if (t.toString().contains(h)) 
							homographs.add(t.toString());
					}			
				}
				System.out.println(Arrays.toString(tokens));
				System.out.println("Количество токенов: " + tokens.length);
				System.out.println("Парадигматические омографы: " + homographs);	
			}
		} catch (Exception e) {
		}
		
	}
}


	
	/*
	 * 
        HashSet<Integer> myHashSet = new HashSet<Integer>();
 
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        // We add 1 one more time
        myHashSet.add(1);
 
        for (int i : myHashSet)
            System.out.println(i);
    }
}
	 */
	