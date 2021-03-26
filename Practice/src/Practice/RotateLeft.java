package Practice;


public class RotateLeft {

	public static void main(String[] args)  {
		int arr[]= {1,2,3,4,5};
		 for (int i = 0; i <3; i++) {
			 int j,temp;
			 temp=arr[0];
			for ( j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
