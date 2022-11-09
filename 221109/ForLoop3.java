// 1 2 3 4 5
// 5 4 3 2 1
// 1 2 3 4 5
// 5 4 3 2 1
public class ForLoop3 {
	public static void main(String[] args){
		int length = 9;
		for (int i = 1; i <= length; i++){
			if (i % 2 == 0) {
				for (int j = 1; j <= length; j++){
					System.out.print(j + " ");
				}
				System.out.println();
			} else {
				for (int j = length; j >= 1; j--){
					System.out.print(j + " ");
				}
				System.out.println();
			}			
		}
	}
}