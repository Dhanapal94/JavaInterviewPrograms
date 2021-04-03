
public class MissingNumberArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,4,7};
		int sum1 =0,sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		for(int i=1;i<=7;i++)
		{
			sum2+=i;
		} 
		int missing = sum2-sum1;
		System.out.println("Missing element in a array is: "+missing); 
	}

}
