import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		int a[] = {12,1,4,6,3,12,1,4,12};
		HashSet<Integer> dup = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					dup.add(a[i]);
				}
			}
		}
		System.out.println("Duplicate elements in a Array is : "+dup);
		

	}

}
