import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class App {

	public static void main(String[] args) {
		File file = new File ("test.txt");
		try {
			FileReader fr = new FileReader(file);
			System.out.println("continuing...");
		} catch (FileNotFoundException e) {
		  System.out. println("File Not Found " + file.toString());
		}
		  System.out. println("Finished");
	}
public static void openFile(String filename) throws FileNotFoundException
{
	File file = new File (filename);
	FileReader fr = new FileReader(file);
	
}
}
