package Practice;


public class Sample {

	public static void main(String[] args)  {
		  int a[][] = { { 1, 2, 3, 4 },
                  { 5, 6, 7, 8 },
                  { 9, 10, 11, 12 },
                  { 13, 14, 15, 16 } };
		  int n=4;
		for (int i = 0; i < n; i++) {
			
			for (int j =n-1; j>=0 ; j--) {
				
					System.out.print(a[j][i]+" ");
				
			}
			System.out.println();
		}
		
	}

}
