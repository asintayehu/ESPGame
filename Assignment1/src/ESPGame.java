import java.util.*;
import java.io.*;

public class ESPGame {
	
	/*
	 * PROGRAMMER: AARON SINTAYEHU
	 * PROFESSOR: DR. GRIGORIY GRINBERG
	 * DUE DATE: 6/17/24
	 * ASSIGNMENT 1: ESP GAME
	 * 
	 */
	public static void main(String[] args) {
		final String BLACK = "black";
		final String WHITE = "white";
		final String GRAY = "gray";
		final String SILVER = "silver";
		final String MAROON = "maroon";
		final String RED = "red";
		final String PURPLE = "purple";
		final String FUCHSIA = "fuchsia";
		final String GREEN = "green";	
		final String LIME = "lime";
		final String OLIVE = "olive";
		final String YELLOW = "yellow";
		final String NAVY = "navy";
		final String BLUE = "blue";
		final String TEAL = "teal";
		final String AQUA = "aqua";
		
		final int MAX_SCORE = 3;
		Random random = new Random(); // random object to generate random color
		int score = 0; // holds score for game
		String filename; // file we will be working with
		Scanner keyboard = new Scanner(System.in);
		String selectedColor = null; // holds randomly generated color
		String userGuess; // holds user's guess for colors
		
		// End of game user defined descriptions
		String userName;
		String userDesc;
		String dueDate;
		
		
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
		
		
		try {
			// opening file reader
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			
			// Outputting contents of file for player
			System.out.println("\nThere are sixteen colors from a file:\n");
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			// closing file reader
			reader.close();
		
			
			for(int i = 0; i < 3; i++) {
				
				// Generates random color
				int randLineNum = random.nextInt(16)+1;
				reader = new BufferedReader(new FileReader(filename));
				for(int j = 1; j <= randLineNum; j++) {
					selectedColor = reader.readLine();
				}
				
				// isolating color from number
				selectedColor = selectedColor.split(" ")[1];
				reader.close();
				
				System.out.println("\nI am thinking of a color.");
				System.out.println("Is it one of list of colors above?\n");
				System.out.print("Enter your guess: ");
				userGuess = keyboard.next();
				
				// color input validation
				while(  !userGuess.toLowerCase().equals(BLACK) && 
						!userGuess.toLowerCase().equals(WHITE) && 
						!userGuess.toLowerCase().equals(GRAY) && 
						!userGuess.toLowerCase().equals(SILVER) &&
						!userGuess.toLowerCase().equals(MAROON) &&
						!userGuess.toLowerCase().equals(RED) && 
						!userGuess.toLowerCase().equals(PURPLE) &&
						!userGuess.toLowerCase().equals(FUCHSIA) &&
						!userGuess.toLowerCase().equals(GREEN) && 
						!userGuess.toLowerCase().equals(LIME) && 
						!userGuess.toLowerCase().equals(OLIVE) &&
						!userGuess.toLowerCase().equals(YELLOW) &&
						!userGuess.toLowerCase().equals(NAVY) &&
						!userGuess.toLowerCase().equals(BLUE) &&
						!userGuess.toLowerCase().equals(TEAL) &&
						!userGuess.toLowerCase().equals(AQUA)) {
					
					System.out.print("Please enter a color included in the list: ");
					userGuess = keyboard.nextLine();
					
				}
				
				// displaying correct color
				System.out.println("\nI was thinking of " + selectedColor.toLowerCase() + ".");
				
				// score increment
				if(userGuess.toLowerCase().equals(selectedColor.toLowerCase())) {
					score += 1;
				}
				
								
			}
			// end of game score display
			System.out.println("Game over.");
			System.out.println("You got " + score + " out of " + MAX_SCORE + " correct.");
			
			// clearing text input field
			keyboard.nextLine();
			
			// collecting user information
			System.out.print("Enter your name: ");
			userName = keyboard.nextLine();
			
			System.out.print("\nDescribe yourself: ");
			userDesc = keyboard.nextLine();
			
			System.out.print("\nDue Date: ");
			dueDate = keyboard.nextLine();
			
			// formatting/style
			System.out.print("\n----------------------------------------------\n");
			
			System.out.println("User Name: " + userName);
			System.out.println("Describe yourself: " + userDesc);
			System.out.println("Due Date: " + dueDate);
			
			
			System.out.print("\n----------------------------------------------\n");
			
			// end of game message
			System.out.println("Thank you for playing!\nPROGRAMMER NAME: Aaron Sintayehu\nProfessor: Dr. Grigoriy Grinberg\nDue Date: 06/17\nAssignment 1: ESP Game");
			
			
		}catch(IOException e)
		
		{
			e.printStackTrace();
		}
		
	}

}
