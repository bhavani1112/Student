import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class QueueDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Object> q1=new ArrayDeque<>(List.of("Python","Ruby","C#","Java"));
		Queue<Object> q2=new ArrayDeque<>(List.of("Python","Ruby","C#","Java"));
		Queue<Object> q3=new ArrayDeque<>(List.of(20,50,30,40));
		boolean result=q1.equals(q2);
		System.out.println("both are equal or not?:"+result);
		System.out.println(q3.toArray());
	
		

	}

}
