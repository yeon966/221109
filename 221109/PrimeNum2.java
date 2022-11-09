
public class PrimeNum2{
	public static int main(String[] args){
		int num, i;
		for(num = 2; num <= 100; num++) {
		     for (i = 2; i <= num; i++) {
		         if(num % i == 0)
		        	 break;
		         if(num == i) 
		        	 System.out.println(num);
		     }
		     return 0;
		}
	}
}