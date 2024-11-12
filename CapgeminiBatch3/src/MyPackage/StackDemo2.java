package MyPackage;

import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<>();
		s.push("Java");
		s.push("Python");
		s.push("C#");
		System.out.println("Elements in Stack:");
		for(String c:s)
		{
			System.out.println(c);
		}
		System.out.println("----------------------");
		String popped_ele=s.pop();
		System.out.println("popped ele:"+popped_ele);
		System.out.println("----------------------");
		
		System.out.println("Elements after pop operation:");
		for(String c:s)
		{
			System.out.println(c);
		}
		
		
		
		

	}

}
