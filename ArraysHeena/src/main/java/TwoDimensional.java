
public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {100,200}, {300,400}, {500,600}};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[2][0]);
		
		/*for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<2;c++)
			{
			System.out.println(a[r][c]);
			}
		}*/
		
		for(int b[]:a)
		{
		      for(int i:b) {
			System.out.print(i+ "    ");
		      }
		    System.out.println()  ;
		}
	}

}
