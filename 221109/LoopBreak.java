public class LoopBreak {
	public static void main(String[] args){
		// 3번의 문자열 출력후에 중단
		int i = 0;
		while (i < 3) {
			System.out.println("반복 중");
			if ( i == 2) {
				break;
			}
			i++;
		}
		System.out.println("프로그램 종료");
	}
}