package Practice;


public class StarSimpleProgram {

	public static void main(String[] args) {
		
		  int a[][]= {{1,0,0,1},
				      {0,1,1,0},
				      {0,1,1,0},
				      {1,1,1,1}
				      };
		  for (int i = 0; i < a.length; i++)
		  {
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j]==1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			System.out.println("===================");

		  int n=3;
		  for(int i=0;i<3;i++)
		  {
			  for (int j = 0; j < 3; j++) {
				System.out.print(" *");
			}
			  System.out.println();
		  }
	}

}
