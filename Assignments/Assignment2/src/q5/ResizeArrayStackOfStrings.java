package q5;

import java.util.NoSuchElementException;

import q4.Record;

public class ResizeArrayStackOfStrings {
	Record [] s; 
	private static int N; // number of items in stack 
	// create an empty stack with given capacity 
	public ResizeArrayStackOfStrings(int g) 
	{ 
		s = new Record [g]; N = 0; 
	} 
	
	public boolean isEmpty()
	{ 
		return N == 0; 
	} 

	//resize the underlying array holding the elements 
	private void resize(int capacity) 
	{ 
		assert capacity >= N; 
		Record [] temp = new Record [capacity]; 
		for (int i = 0; i < N; i++) 
		{ 
			temp[i] = s[i]; 
			} 
		s = temp; 
	} 
	
	public void push(Record z)
	{ 
		if (N == s.length) resize(2*s.length); // double size of array if necessary 
		s[N++] = z; 
	} 
	public Record pop()
	{ 
		if (isEmpty()) throw new NoSuchElementException("Stack underflow"); 
		Record item = s[N-1]; 
		s[N-1] = null; // to avoid loitering 
		N--; 
		// shrink size of array by 50% if necessary 
		if (N > 0 && N == s.length/4) resize(s.length/2); 
		return item; 
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResizeArrayStackOfStrings rs = new ResizeArrayStackOfStrings(6); 
		Record p =new Record (); 
		Record q =new Record (); 
		Record r =new Record (); 
		Record s =new Record (); 
		Record t =new Record (); 
		Record u =new Record (); 
		p.setNumber(31); 
		p.setName("Name1"); 
		q.setNumber(24); 
		q.setName("Name2"); 
		r.setNumber(10); 
		r.setName("Name3"); 

		s.setNumber( 44); 
		s.setName("Name4"); 
		t.setNumber(81); 
		t.setName("Name5"); 
		u.setNumber(25); 
		u.setName("Naveen"); 
		rs.push(p); 
		rs.push(q); 
		rs.push(r); 
		rs.push(s); 
		rs.push(t); 
		rs.push(u); 
		System.out.println(rs.pop().toString()); 
		System.out.println(rs.pop().toString()); 
		System.out.println(rs.pop().toString()); 
		System.out.println(rs.pop().toString()); 
		System.out.println(rs.pop().toString()); 
		System.out.println(rs.pop().toString()); 


	}

}
