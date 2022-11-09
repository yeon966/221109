public class NestedLoopBreak {
	public static void main(String[] args){
		outer: // 레이블 설정으로 인한 중복 반복문 전체 탈출!
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				System.out.printf("(i : %d, j : %d)\n", i, j);
				break outer;
			}
		}
	}
}