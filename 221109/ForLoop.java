public class ForLoop {
	public static void main(String[] args){
		//별 10번 찍는 반복문을 10번 반복 => 별 100개 (중첩 반복문)
		for (int j = 0; j < 10; j++){
			for (int i = 0; i < 10; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}