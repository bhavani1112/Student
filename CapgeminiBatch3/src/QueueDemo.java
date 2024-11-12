import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		q.offer(100);
		q.offer(200);
		q.offer(300);
		
		System.out.println("Front ele:"+q.peek());
		while(!q.isEmpty())
		{
			int element=q.poll();
			System.out.println("dequeued element:"+element);
		}

	}

}
