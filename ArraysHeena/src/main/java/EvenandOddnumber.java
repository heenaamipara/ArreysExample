
public class EvenandOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,12,13,14,15,16,17,18,19,20};
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers are: " + a[i]);
			}
			else
			{
				System.out.println("odd numberws are: " + a[i]);
			}
		}
	}

}
