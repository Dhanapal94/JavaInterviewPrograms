import java.util.ArrayList;

public class OddEvenArray {

	public static void main(String[] args) {
		int num[]= {12,9,10,5,17,0};
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				even.add(num[i]);
			}
			else
			{
			   odd.add(num[i]);	
			}
		}
		System.out.println("***Even Numbers***");
		System.out.println(even);
		System.out.println("***Odd Numbers***");
		System.out.println(odd);

	}

}
