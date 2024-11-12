import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Username:Peter");
		list.add("peter@gmail.com");
		list.add(9879779798l);
		list.add(25);
		
	      Object rmv_ele=list.remove(2);
	      System.out.println("removed element:"+rmv_ele);
	      System.out.println("------------------");
	      Object index=list.indexOf(25);
	      System.out.println("Index of age field:"+index);
	      System.out.println("------------------");
	      Iterator<Object> itr=list.iterator();
	      while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }
	      System.out.println("------------------");
	      boolean a=list.isEmpty();
	      System.out.println("is Empty?:"+a);
	      System.out.println("------------------");
	      boolean b=list.contains("Smith");
	      System.out.println("is username contains smith?:"+b);
	      
	      
	      
		

	}

}
