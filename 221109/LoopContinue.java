public class LoopContinue {
	public static void main(String[] args){
		// 짝수 출력하기
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				continue; // 반복을 종료시키진 않지만 다음 증감식부분으로 이동
			}
			System.out.println(i);
		}
	}
}