package q8;

public class TestLinkedListQueue 
{
	Node front, rear;
	public TestLinkedListQueue() 
	{ 
		this.front = this.rear = null;
	}
	/**
	* Is this queue empty?
	* @return true if this queue is empty; false otherwise
	*/
	public boolean isEmpty() 
	{ 
		return this.front == null;
	}
	public void enqueue(int item)
	{
		
    	Node temp = new Node(item); 
        
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) 
        { 
           this.front = this.rear = temp; 
           return; 
        } 
       
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
	}
	
	// Method to remove an key from queue.
	public Node dequeue()
	{
        // If queue is empty, return NULL. 
        if (this.front == null) 
           return null; 
       
        // Store previous front and move front one node ahead 
        Node temp = this.front; 
        this.front = this.front.next; 
       
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
           this.rear = null; 
        return temp; 
	}
	
	public static void main(String[] args)
	{
		
    	TestLinkedListQueue q=new TestLinkedListQueue(); 
    	
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
          
        System.out.println("Dequeued item is "+ q.dequeue().item); 
        System.out.println("Dequeued item is "+ q.dequeue().item); 
        q.enqueue(999);
        System.out.println("Dequeued item is "+ q.dequeue().item); 

	}

}
