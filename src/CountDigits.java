
public class CountDigits {

	public static void main(String[] args) {
		
		int num = 45891;
		
		int count =0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count of digits in the number is: "+count);

	}

}
