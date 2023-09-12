package injectorExtractorBack;
import java.util.Scanner;
public class Main {
	
	static private int menu() {
		System.out.println("Select the tools!");
		System.out.println("1.- Injector \n2.- Extractor \n3.- Injector/Extractor");
		System.out.print("Select an option: ");
		Scanner inputMenu = new Scanner (System.in);
		return inputMenu.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int optionMenu = menu();
		System.out.println(optionMenu);
	}

}
