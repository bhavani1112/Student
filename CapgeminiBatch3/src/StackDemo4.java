import java.util.Stack;

public class StackDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<>();
		s.push("Pune");
		s.push("Bengaluru");
		s.push("Mumbai");
		System.out.println(s);
		Object[] o=s.toArray();
		for(Object value:o)
		{
			System.out.println(value);
		}
		

	}

}
