package arrays;

public class FindMinimum {
	public static void main(String[] args) {
		int a[]={30,20,60,90,10,5};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}