/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double avrgChildren = 0;
		String mostCommon = "";
		int twoChild =0;
		int threeChild =0;
		int fourOrMoreChild =0;

		for (int i=0; i<T; i++){
			boolean boy= false;
			boolean girl= false;
			int counter = 0;
			int n;

			while(boy == false || girl == false){
				n = (int) (Math.random()*(2));
				if(n ==  0){
					boy = true;
					
			}
				else {
					girl = true;
				
			}
				counter++;
		}
			avrgChildren += counter;
			if (counter==2){
				twoChild++;
				
			}
			else if (counter==3){
				threeChild++;
			}
			else if(counter>=4){
				fourOrMoreChild++;
			}

	
		}
		System.out.println("Average: "+ ((double)avrgChildren) /T +" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+twoChild);
		System.out.println("Number of families with 3 children: "+threeChild);
		System.out.println("Number of families with 4 or more children: "+fourOrMoreChild);
		if(twoChild> threeChild && twoChild> fourOrMoreChild){
			mostCommon += 2 +".";
		}
		else if(threeChild> twoChild && threeChild> fourOrMoreChild){
			mostCommon += 3+".";
		}
		else if(fourOrMoreChild> twoChild && fourOrMoreChild> threeChild){
			mostCommon += 4+" or more.";
		}
		System.out.println("The most common number of children is " + mostCommon);
		

	}
}
