
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int n;
		boolean boy= false;
		boolean girl= false;
		int counter = 0;

		while(boy == false || girl == false){
			n = (int) (Math.random()*(2));
			if(n ==  0){
				boy = true;
				System.out.print("b ");
			}
			else {
				girl = true;
				System.out.print("g ");
			}
			counter++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " +counter+ " children.");
	}
}
