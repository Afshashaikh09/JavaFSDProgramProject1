package fsdroject1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileOperations {

		// TODO Auto-generated method stub
	static Scanner sc = new Scanner(System.in);	
	File directoryPath = new File("./src/fsdroject1/projectfiles");
	public void getAllFiles() {
		// List of all files and directories
		File[] files = directoryPath.listFiles();
		List<File> filesList = Arrays.asList(files);
		if (filesList.size() > 0) {
			Collections.sort(filesList);
			System.out.println("List of files and directories in ascending order:");
			for (File file : filesList) {
				System.out.println("File name: " + file.getName());
				System.out.println("File path: " + file.getAbsolutePath());
				System.out.println(" ");
			}
		}
		else{
			System.out.println("No Files in the directory!!");
		}

	}

	public void createFile() throws IOException {
		boolean flag = false;
		System.out.println("Enter File name to create");
		String filename = sc.next();
		File[] files = directoryPath.listFiles();
		for (File file : files) {
			if (filename.equals(file)) {
				System.out.println("File already exists");
				flag = true;
				break;
			}
		}
		if (!flag) {
			try {
				File newFile = new File(directoryPath + "\\" + filename);
				System.out.println(newFile);
				newFile.createNewFile();
				System.out.println("File " + newFile.getPath() + " was created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteFile() {
		System.out.println("Enter the file name to delete");
		String filename = sc.next();
		System.out.println(filename);
		File[] files = directoryPath.listFiles();
		boolean flag = false;
		for (File file : files) {
			//System.out.println(file);
			if (filename.equals(file.getName())) {
				file.delete();
				System.out.println("File deleted");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("File " + filename + " does not exist");
		}

	}

	public void searchFile() {
		System.out.println("Enter file name to search");
		String filename = sc.next();
		boolean flag = false;
		File[] files = directoryPath.listFiles();
		if (files.length == 0) {
			System.out.println("Directory is empty");
		} else {
			// Linear Search
			for (File file : files) {
				if (filename.equals(file.getName())) {
					System.out.println("File found");
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("File Not Found");
			}
		}
	}
}
