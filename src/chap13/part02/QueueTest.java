package chap13.part02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<String>();
		queue.offer("kor");
		queue.offer("jap");
		queue.offer("usa");
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
