/*	3.
	    *
	   **
	  ***
	 ****
	*****
*/
public class Stars3{
	public static void main(String[] args){
		String star = "*";
		for (int j = 5; j > 0; j--){
			for (int i = 1; i <= 5; i++){
				if (i < j) {
				System.out.print(" ");	
				} else {
				System.out.print(star);		
				}
			}
			System.out.println();
		}
	}
}