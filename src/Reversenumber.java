
public class Reversenumber {

	public static void main(String[] args) {
		
		//Step1
		int num = 3504;
		int rev=0;
		while(num!=0)
		{
		    rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("Reversed number is"+rev);
		
		//Step2 - String Buffer class
		
		int number = 8915;
		StringBuffer s = new StringBuffer();
		s.append(number);
		StringBuffer reverse = s.reverse();
		System.out.println(reverse);
		
		
			

	}

}
