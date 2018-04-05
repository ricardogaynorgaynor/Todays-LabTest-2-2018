/*
 * 
 * 
 * AUTHOR: RICARDO GAYNOR
 * UTECH 
 * DATA STRUCTURES LAB TEST 2108
 */
public class Queue {
	
	

	private Node front;
	
	public Queue(){
		front = null;
	}
	
	
	public boolean isEmpty(){
		return front == null;
	}
	
	public boolean isFull(){
		Node temp = new Node();
		if(temp == null){
			return true;
		}else{
			temp = null;
			return false;
		}
	} 
	
	public void enqueue(Drink drink){
		if(isFull()){
			System.out.println("The queue is full");
		}else{
			Node temp = new Node(drink);
			if(isEmpty()){
				front = temp;
			}else{
			
			Node current = front;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(temp);
			
			}
			
		} 
	}
	
	
	public Drink dequeue(){
		Drink data = null;
		if(isEmpty()){
			System.out.println("The stack is empty");
		}else{
			Node temp = front;
			front = front.getNext();
			data = temp.getData();
			temp = null;
		}
		 
		return data;
		
		}

	
	
	public void destroy(){
		while(this.dequeue() != null);
	} 
	
	
	
	
	
	
	
	

}
