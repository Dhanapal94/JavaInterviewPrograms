
public class CountDigitsSum {

	public static void main(String[] args) {
		int num =3493901;
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num=num/10;
		}
		System.out.println("Sum of digits in the Number is :"+sum);

	}

}
