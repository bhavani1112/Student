import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("top element:"+s.peek());
		System.out.println("---------------------------");
		int popped_ele=s.pop();
		System.out.println(popped_ele);
		System.out.println("---------------------------");
		System.out.println("isempty?:"+s.isEmpty());
		System.out.println("---------------------------");
		System.out.println("stack size:"+s.size());
		System.out.println("---------------------------");
		System.out.println("Stack elements");
		for(Integer value:s)
		{
			System.out.println(value);
		}
		
		

	}

}
