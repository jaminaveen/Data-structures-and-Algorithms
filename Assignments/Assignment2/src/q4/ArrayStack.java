package q4;

public class ArrayStack {
Record [] s;
private static int N; // number of items in stack
// create an empty stack with given capacity
	public ArrayStack(int g) 
	{
		s = new Record[g]; 
		N = 0;
	}
	public boolean isEmpty()
	{
		return N == 0;
	}
	public void push(Record element)
	{
		s[N++] = element;
	}
	public Record pop()
	{
		return s[--N];
	}

//main method
public static void main(String[] args) 
{
	ArrayStack ss = new ArrayStack(8);
	Record p =new Record ();
    Record q =new Record ();
	Record r =new Record ();
	Record s =new Record ();
	Record t =new Record ();
	p. number = 31;
	p.name ="Name1";
	q.number = 24;
	q.name ="Name2";
	r. number = 10;
	r.name ="Name3";
	s. number = 44;
	s.name ="Name4";
	t. number = 81;
	t.name ="Name5";
	ss.push(p);
	ss.push(q);
	ss.push(r);
	ss.push(s);
	ss.push(t);
	System.out.println(ss.pop().toString());
	System.out.println(ss.pop().toString());
	System.out.println(ss.pop().toString());
	System.out.println(ss.pop().toString());
	System.out.println(ss.pop().toString());
}
}
