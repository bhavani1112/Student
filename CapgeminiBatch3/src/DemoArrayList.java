import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Object> list=new ArrayList<Object>();
       list.add("python");
       list.add("Java");
       list.add("C#");
       //Iterator
       Iterator<Object> itr=list.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       System.out.println("-----------------------");
       Object rmv_ele=list.remove(2);
       System.out.println("removed element:"+rmv_ele);
       System.out.println("-----------------------");

       System.out.println(list);
       System.out.println("-----------------------");
       boolean result_java=list.contains("Java");
       System.out.println("is java present in the list:"+result_java);
       boolean islist_empty=list.isEmpty();
       System.out.println("list empty?:"+islist_empty);
	}

}
