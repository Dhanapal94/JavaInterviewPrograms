import java.util.*;
public class CheckArrayEquals {

	public static void main(String[] args) {

		//Step 1
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		boolean check = Arrays.equals(a1,a2);
		if(check)
		{
			System.out.println("Arrays are Equals");
		}
		else
		{
			System.out.println("Arrays are not Equals");
		}

		//Step2
		boolean flag = false;
        l1:
		for(int i=0;i<a1.length;i++)
		{
			l2:
			for(int j=i;j<=i;j++)
			{
				if(a1[i]==a2[j])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break l1;
				}
			}
		}
		if(flag)
		{
			System.out.println("Arrays are Equals");
		}
		else
		{
			System.out.println("Arrays are not Equals");
		}

	}

}
