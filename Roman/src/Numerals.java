
public class Numerals {
	private String romanNumeral = "";

	public String getNumber(int userNumber){

		while(userNumber >= 1000){
			romanNumeral += "M";
			userNumber -= 1000;

		}
		while(userNumber >= 900){
			romanNumeral += "CM";
			userNumber -= 900;
		}
		
		while(userNumber >= 100){
			romanNumeral += "C";
			userNumber -= 100;
		}
		while(userNumber >= 90){
			romanNumeral += "XC";
			userNumber -= 90;
		}
		while(userNumber >= 10){
			romanNumeral += "X";
			userNumber -= 10;
		}
		while(userNumber >= 9){
			romanNumeral += "IX";
			userNumber -= 9;
		}
		while(userNumber >= 5){
			romanNumeral += "V";
			userNumber -= 5;
		}
		while(userNumber >= 4){
			romanNumeral += "IV";
			userNumber -= 4;
		}
		while(userNumber >= 1){
			romanNumeral += "I";
			userNumber -= 1;
		}

		return romanNumeral;
	}

	

}
