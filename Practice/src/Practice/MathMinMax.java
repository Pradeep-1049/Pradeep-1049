package Practice;


public class MathMinMax {

	public static void main(String[] args)  {
		int num[]= {2,3,4,3,5,63};
		int min=num[0];
		int max=num[0];
		for (int i = 0; i < num.length; i++) {
			max=Math.max(max, num[i]);
			min=Math.min(min, num[i]);
		}
		int newValue=max-min;
		System.out.println(newValue);
		
	}

}
