package sit707_week1;
import java.util.Scanner;

/**
 * Hello world!
 *	
 * 
 */
public class Main {

	/*
	 * Main entry point of a Java program.
	 */
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter your choice:");
	        System.out.println("1. Open Chrome and Close");
	        System.out.println("2. Open Chrome, Maximize and Close");
	        System.out.println("3. Load Web Page and Close");
	        System.out.println("4. Open Chrome, Load Page, Resize, and Close");
	        int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			SeleniumOperations.open_chrome_and_close();
			break;
		case 2:
			SeleniumOperations.open_chrome_maximize_close();
			break;
		case 3:
			SeleniumOperations.load_web_page_close();
			break;
		case 4:
			SeleniumOperations.open_chrome_loadpage_resize_close();
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}
}
