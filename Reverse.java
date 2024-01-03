/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {

	public static void main (String[] args){

		String originalString =  (args [0]);
		String reverseString = "";
		char char1;
		int position;
		int length;

		for (int i = 0; i < originalString.length(); i ++){

			char1 = originalString.charAt(i);

			reverseString = char1 + reverseString;


		}
		System.out.println(reverseString);

		if (originalString.length() % 2 == 0){
			position = originalString.length()/2-1;
			length = 1;


		}
		else {
			position = originalString.length()/2;
			length = 1;
		}
		System.out.println("The middle character is " + originalString.substring(position, position + length));

	}
}
