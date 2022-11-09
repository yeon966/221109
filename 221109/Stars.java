/*	1.
	*
	**
	***
	****
	*****
*/
public class Stars {
	public static void main(String[] args){
		String star = "*";
		for (int j = 0; j < 5; j++){
			for (int i = 0; i <= j; i++){
				System.out.print(star);
			}
			System.out.println();
		}
	}
}