import java.util.*;
class Arreys 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("enter the size :");

		int s=sc.nextInt();
		
		int arr[]=new int[s];
	
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("select a number");
			int x =sc.nextInt();
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==x)
			{
				for (int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
					arr[arr.length-1]=0;
					//i--;
				}
			}
				//System.out.println(arr[i]);
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
