package fsdroject1;
import java.io.IOException;
import java.util.Scanner;

public class FileMenu {

	public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);			
			FileOperations fileobs = new FileOperations();
			boolean appFlag = true; 
			do{
				displayMenu();
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					// iterate and display the list of all files
					fileobs.getAllFiles();
					break;
				case 2:
					//Create a new file
					fileobs.createFile();
					break;
				case 3:
					//Delete a file from existing list. Add case sensitivity.
					fileobs.deleteFile();
					break;
				case 4: 
					// Search a user specified file. Add case sensitivity. 
					fileobs.searchFile();
					break;
				case 5:
					// Close application
					System.out.println("Logging Out!!");
					appFlag = false;
					break;
			}
			}while(appFlag);
	}
	
		public static void displayMenu(){
		System.out.println("Welcome @ LockedMe.com");
		System.out.println("(Developed by Afsha Shaikh)");
		System.out.println("Main Menu : Please select one of the options");
		System.out.println("1. Display All Files");
		System.out.println("2. Add a new File");
		System.out.println("3. Delete a File");
		System.out.println("4. Search for a File");
		System.out.println("5. Logout");
		}

}
