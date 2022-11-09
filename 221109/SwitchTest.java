public class SwitchTest {
	public static void main(String[] args){
		int i = 3;
		
		switch (2) { // 논리값이 아닌 정수 입력 => 그 정수를 시작으로 최대 케이스까지 출력
			case 1:
			System.out.println("1번 선택");
			break;
			case 2:
			System.out.println("2번 선택");
			int a = 10;
			System.out.println(a); //브레이크 걸려도 밑으로 실행은 되기에 변수는 겹치면 안됨
			break;
			case 3:
			System.out.println("3번 선택");
			break;
			case 4:
			System.out.println("4번 선택");
			break;
		}
	}
}