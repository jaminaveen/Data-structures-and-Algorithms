package q8;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedListStack {

	private int n;          // size of the stack
	private Node first;     // top of stack


	/**
	 * Initializes an empty stack.
	 */
	public LinkedListStack() {
		first = null;
		n = 0;
	}

	/**
	 * Is this stack empty?
	 * @return true if this stack is empty; false otherwise
	 */
	public boolean isEmpty() {
		return first == null;
	}
	/**
	 * returns size of the stack
	 */
	public int size() {
		return n;
	}


	/**
	 * Adds the item to this stack.
	 * @param item the item to add
	 */
	public void push(Row item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		n++;
	}

	/**
	 * Removes and returns the item most recently added to this stack.
	 * @return the item most recently added
	 * @throws java.util.NoSuchElementException if this stack is empty
	 */
	public Row  pop() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		Row item = first.item;        // save item to return
		first = first.next;            // delete first node
		n--;
		return item;                   // return the saved item
	}


	/**
	 * Returns (but does not remove) the item most recently added to this stack.
	 * @return the item most recently added to this stack
	 * @throws java.util.NoSuchElementException if this stack is empty
	 */
	public Row peek() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		return first.item;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListStack os = new LinkedListStack();
		LinkedListStack rs = new LinkedListStack();

		DataImport data = new DataImport();
		data.readData();
		ArrayList<Row> inputText = data.inputData ;
		
		// Test to push and pop 3 elements in the arraylist
		
		for (int i=0; i<3; i++) {
			os.push(inputText.get(i));
			
		}
		
		System.out.println("\nTesting push and pop 3 elements in the arraylist:\n");
		for (int i=0; i<3; i++) {
			System.out.println(os.pop());
		}
		
		for(Row row : inputText ) {
		      os.push(row);
		}
		
		// Test for all rows stored in the arraylist
		
        System.out.println("\nPrinting original stack in reverse order:\n");
		for(int i = 0; i<inputText.size();i++) {
		Row popped = os.pop();
		System.out.println(popped.toString());
		rs.push(popped);
		}

		System.out.println("\nPrinting reverse stack in original order:\n");
		for(int i = 0; i<inputText.size();i++) {
		System.out.println(rs.pop().toString());
		}
		

		

	}

	

	}


