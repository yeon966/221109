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
		int a = 6;
		for (int j = -1; j <= 7; j+= 2){
				for (int i = 1; i <= j + a; i++){
					if ( < j + a){
						System.out.print(star);
					} else {
						System.out.print(" ");
					}
					a--;
				}
			System.out.println();
			a = 6;
		}
	}
}