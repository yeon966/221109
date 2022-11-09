/*	2.
	*****
	****
	***
	**
	*
*/
public class Stars2 {
	public static void main(String[] args){
		String star = "*";
		for (int j = 5; j > 0; j--){
			for (int i = 1; i <= j; i++){
				System.out.print(star);
			}
			System.out.println();
		}
	}
}