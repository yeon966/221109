// 구구단
// 2단 ~ 9단
public class Gugudan2 {
	public static void main(String[] args){
		for (int j = 2; j <= 9; j++){
			for (int i = 1; i <= 9; i++){
				System.out.printf("%d x %d = %d\n", j, i, j * i);
			}
			System.out.println();
		}
	}
}