package q9;

public class ArrayQueue {
	 int front, rear, size; 
	 int  array_length; 
	 int array[]; 
	    
	 public ArrayQueue(int array_length) { 
	      this.array_length = array_length; 
	      front = this.size = 0;  
	      rear = array_length - 1; 
	      array = new int[this.array_length]; 
	         
	 } 

	 boolean isFull(ArrayQueue queue) 
	 {  return (queue.size == queue.array_length); 
	 } 
	 
	 boolean isEmpty(ArrayQueue queue) 
	 {  return (queue.size == 0); } 
	    
	  void enqueue(int item) 
	 { 
	     if (isFull(this)) 
	         return; 
	     this.rear = (this.rear + 1)%this.array_length; 
	     this.array[this.rear] = item; 
	     this.size = this.size + 1; 
	     System.out.println(item+ " pushed to queue"); 
	 } 

	 int dequeue() 
	 { 
	     if (isEmpty(this)) 
	         return Integer.MIN_VALUE; 
	        
	     int item = this.array[this.front]; 
	     this.front = (this.front + 1)%this.array_length; 
	     this.size = this.size - 1; 
	     return item; 
	 } 
	    
	  
	 int peek() 
	 { 
	     if (isEmpty(this)) 
	         return Integer.MIN_VALUE; 
	     return this.array[this.front]; 
	 } 
	     
	 // Method to get rear of queue 
	 int rear() 
	 { 
	     if (isEmpty(this)) 
	         return Integer.MIN_VALUE; 
	        
	     return this.array[this.rear]; 
	 } 
	 


	 public static void main(String[] args)  
	 { 
		 ArrayQueue queue = new ArrayQueue(100); 
	         
	     queue.enqueue(1); 
	     queue.enqueue(2); 
	     queue.enqueue(3); 
	     queue.enqueue(4);    
	     queue.enqueue(5); 
	 
	     
	     System.out.println("\n"+ queue.dequeue() +" dequeued from queue\n"); 
	     
	     System.out.println("Front item is " +  
	                            queue.peek()); 
	        
	     System.out.println("Rear item is " +  
	                             queue.rear()); 
	 } 
	} 