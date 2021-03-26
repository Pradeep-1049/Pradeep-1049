package Sample;

import java.util.HashSet;
import java.util.Iterator;

public class Mainclass2 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		   hs.add("aaa");
		   hs.add("bbb");
		   hs.add(null);
		   hs.add("ddd");
		   
		   
		   System.out.println(hs);
		     
		   
		   hs.stream()
		       .forEach(str-> System.out.println(str));
		   
		   Iterator<String> i1 = hs.iterator();
	       while(i1.hasNext())
	       {
	         System.out.println(i1.next());
	       }
	  
		   

	}

}
