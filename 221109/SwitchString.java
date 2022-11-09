public class SwitchString {
	public static void main(String[] args){
		String str = "qwe";
		
		switch (str) {
			case "ABC":
			System.out.println("에이비씨");
			break;
			case "DEF":
			System.out.println("디이에프");
			break;
			default:
			System.out.println("case 중 하나도 없을때 무조건 실행");
		}
	}
}