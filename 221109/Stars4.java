/*	4.
	    *
	   ***
	  *****
	 *******
	*********
*/
public class Stars4{
	public static void main(String[] args){
		String star = "*";
		int a = -1;
		for (int j = 5; j > 0; j--){
			a++;
			for (int i = 1; i <= 5 + a; i++){
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