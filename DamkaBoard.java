/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args [0]);
		boolean change = true;
	

		for (int i= 0; i< n; i++){
			String str="";
			for (int j= 0; j< n; j++){
				if(change==true){
					str +=  "* ";
				}
				if(change==false){
					str +=  " *";
				}
			}
			if(change==true){
				change=false;
			}else{
				change=true;
			}
			
			System.out.println(str);

		}
		
	}
}
