import java.util.*;
import java.io.*;

public class ESPGame {

	public static void main(String[] args) {
		
		Random random = new Random(); // random object to generate random color
		int score = 0; // var to hold score for game
		String filename; // var to "touch" file
		Scanner keyboard = new Scanner(System.in);
		String selectedColor = null;
		
		// Filename input/ file initialization
		System.out.print("Enter the filename: ");
		filename = keyboard.next();
		File file = new File(filename);
		
		// file validation
		while(!file.exists()) {
			System.out.print("File not found. Please enter a different filename: ");
			filename = keyboard.next();
			file = new File(filename);
		}
		 
		// generates number which is associated with color in text file
		int randLineNum = random.nextInt(16)+1;
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			
			// Outputting contents of file for player
			System.out.println("\nThere are sixteen colors from a file:\n");
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
			reader = new BufferedReader(new FileReader(filename));
			for(int i = 1; i <= randLineNum; i++) {
				selectedColor = reader.readLine();
			}
			
			// isolating color from number
			selectedColor = selectedColor.split(" ")[1];
			reader.close();
			
		}catch(IOException e)
		
		{
			e.printStackTrace();
		}
		
	}

}
