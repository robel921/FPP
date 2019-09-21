package Lesson9prob2;

class Node1 {
	int data;
	Node1 next; /

	Node1(int d) 
	{
		data = d;
	} 
}

class LinkedStack {
	int count;
	Node1 top;
	Node1 p; 
	
	public void push(int item) 
	{
		p = new Node1(item);
		p.next = top; 
		top = p; 
		count++;
		
		System.out.println(top.data);
	}

	public Node1 pop() 
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		Node1 tmp = top; 
		top = tmp.next; 
		System.out.println(top.data);
		count--;
		return tmp; 
	}

	public int peek() 
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return top.data;
	}

	public void displayStack() {
		p = top; 
		System.out.print("\nContents of Stack: [ ");
		while (p != null) 
		{
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println("]");
	}

	public boolean isEmpty() 
	{
		return (top == null);
	}
	public int size(){
		return count;
	}
}

public class linkedstackdemo {

	public static void main(String[] args) {
		LinkedStack stk = new LinkedStack(); 
		Node1 item; 
		stk.push(20);
		stk.push(35);
		stk.push(40);
		stk.displayStack(); 
		item = stk.pop();
		if (item != null) {
			System.out.println("Popped item: " + item.data);
			stk.displayStack();
		}
		stk.push(65); 
		stk.push(70);
		stk.push(75);
		stk.displayStack(); 
		System.out.println("Size of the Stack :" + stk.size());
		item = stk.pop(); 
		if (item != null) {
			System.out.println("Popped item: " + item.data);
			stk.displayStack();
		}
		System.out.println("peek(): " + stk.peek());
		stk.push(90);
		stk.displayStack();

	}

}
