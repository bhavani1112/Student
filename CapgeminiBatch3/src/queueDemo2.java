import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class queueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Object> q=new ArrayDeque<>(List.of("java","Python","C#"));
		System.out.println(q);
		System.out.println(q.peek());
		q.removeAll(q);
		if(q.isEmpty())
		{
			System.out.println("No Data in queue");
		}
		

	}

}
