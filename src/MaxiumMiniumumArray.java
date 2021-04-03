
public class MaxiumMiniumumArray {

	public static void main(String[] args) {
		int a[] = {12,78,33,89,100,4,1};
		int max =a[0];
		int min =a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum Number array is: "+max);
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Number array is: "+min);

	}

}
