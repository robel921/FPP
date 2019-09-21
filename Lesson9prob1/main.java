package Lesson9prob1;

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			
		System.out.println(q.size());

	}

}
