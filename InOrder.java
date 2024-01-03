/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	
	public static void main (String[] args) {
		int randomNum = (int) (Math.random() * 10);
    int nextNum;
    int temp;
    System.out.println(randomNum);
      
     
       do{
         nextNum =  (int) (Math.random() * 10);
        if ( nextNum > randomNum){
          System.out.println(" " + nextNum);
          temp = randomNum;
          randomNum = nextNum;
          nextNum = temp;
        }

       } while (randomNum > nextNum);
    }
              
           
	}
	

