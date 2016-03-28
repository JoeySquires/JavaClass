import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		
		String userInput;
		int userNumber;
		
		System.out.println("Welcome to the Roman Numeral Calculator");
		
		Scanner inputScanner = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a whole number: ");
			
			if(inputScanner.hasNextInt()){
			userInput = inputScanner.nextLine();
			userNumber = Integer.parseInt(userInput);
			Numerals roman = new Numerals();
			String romanNumeral = roman.getNumber(userNumber);
			System.out.println(romanNumeral);
			}
			else{
				System.out.println("Please enter a whole number");
			}
            System.out.print("Continue? (y/n): ");
            choice = inputScanner.nextLine();
            System.out.println();
			
		}
        inputScanner.close();
        System.out.println("Bye!");

	}

}
