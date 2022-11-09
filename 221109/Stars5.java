/*	5.
*********
 *******	   
  *****
   ***
    *
*/
public class Stars5{
	public static void main(String[] args){
		String star = "*";
		int a = 0;
		for (int j = 0; j < 5; j++){
			a--;
			for (int i = 0; i <= 9 + a; i++){
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