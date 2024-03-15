import java.util.Arrays;

public class SingleDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {100,200,300,400,500};
		
		System.out.println(a.length);
		System.out.println(a[2]);
		System.out.println(Arrays.toString(a));
		
		/*for(int i=0;i<=4;i++)    //or (int i=0;i<a.length;i++) i is index
		{
			System.out.println(a[i]);
		}*/
		
		for (int x:a)                //enhanced for loop to read data
		{
			System.out.println(x);
		}
		
	}

}
