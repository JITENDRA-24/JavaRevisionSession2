package Array;

public class example8
{
	public static void main(String[] args) 
	{
		//  0  1  2
		//0 10 20 30
		//1 40 50 60
					
		
		int [][] ar= {{10,20,30}, {40,50,60}};
		
				
		System.out.println(ar[1][2]);
		System.out.println(ar.length);
		
		
		
		System.out.println("--------");
		
		for(int i=0; i<=1; i++)   //outer for loop -> rows
		{
			for(int j=0; j<=2; j++) // inner for loop -> cols
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
