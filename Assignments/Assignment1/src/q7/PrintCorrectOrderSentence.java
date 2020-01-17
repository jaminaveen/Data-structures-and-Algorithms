package q7;

import java.util.Stack;

public class PrintCorrectOrderSentence {

	public Stack<String> s1 , s2;

	// Constructor
	public PrintCorrectOrderSentence () {
		s1 = new Stack<String>();
		s2 = new Stack<String>();
	}

	// Enqueue an item to the queue using stack operation push
	public void push_to_stack(String key) {
		//move all elements from the first stack to the second stack
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
	
		}
		// Push item into the first stack
		s1.push(key);

		// Move all elements back to the first stack from second stack
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	// Dequeue an item from the queue
	public String pop_from_stack() {
		// if first stack is empty
		if (s1.isEmpty()) {
			System.out.println("Underflow!!");
			System.exit(0);
		}

		// return the top item from the first stack
		return (String) s1.pop();
	}

	public static void main(String[] args) {
		//ring sentence_part1 = "he best of time";
		PrintCorrectOrderSentence q = new PrintCorrectOrderSentence();

			q.push_to_stack("it");
			q.push_to_stack("was");
			q.push_to_stack("the");
			q.push_to_stack("best");
			q.push_to_stack("of");
			q.push_to_stack("times");
			
		System.out.println(q.pop_from_stack());
		System.out.println(q.pop_from_stack());
		System.out.println(q.pop_from_stack());
		System.out.println(q.pop_from_stack());
		System.out.println(q.pop_from_stack());
		System.out.println(q.pop_from_stack());

	}
}
