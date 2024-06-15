import java.util.*;
import java.io.*;

public class ESPGame {

	public static void main(String[] args) {
		
		String filename;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		
		filename = keyboard.next();
		
		try {
			File file = new File(filename);
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			
			
		}catch(IOException e)
		
		{
			e.printStackTrace();
		}
		


	}

}
