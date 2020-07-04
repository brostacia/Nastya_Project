
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadInputs {

	public static void main(String[] args) {
		File file = new File("Nastya_Project/src/file.txt");
		try (FileReader fileReader = new FileReader(file)) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println((String) line);
			}
		} catch (Exception e) {
		}
	}
}
