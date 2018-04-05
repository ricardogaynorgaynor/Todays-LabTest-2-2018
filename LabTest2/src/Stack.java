/*
 * 
 * 
 * AUTHOR: RICARDO GAYNOR
 * UTECH 
 * DATA STRUCTURES LAB TEST 2108
 */
public class Stack {
	
	private Node top;
	
	public Stack(){
		top = null;
	}
	
	
	public boolean isEmpty(){
		return top == null;
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
	
	public Drink pop(){
		Drink data = null;
		if(isEmpty()){
			System.out.println("The stack is empty");
		}else{
			Node temp = top;
			top = top.getNext();
			data = temp.getData();
			temp = null;
		}
		
		return data;
	}
	
	
	public Drink push(Drink drink){
		Drink data = null;
		if(isFull()){
			System.out.println("The stack is full");
		}else{
			Node temp = new Node(drink);
			if(isEmpty()){
				top = temp;
			}else{
				temp.setNext(top);
				top = temp;
			}
		}
		
		return data;
	}
	
	
	public void destroy(){
		while(this.pop() != null);
	} 
	
	
	public Drink getTop(){
		return top != null ? top.getData()  : null;	
		
	}
	
	
	

}
