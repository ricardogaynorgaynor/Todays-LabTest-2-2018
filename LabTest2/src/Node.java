/*
 * 
 * 
 * AUTHOR: RICARDO GAYNOR
 * UTECH 
 * DATA STRUCTURES LAB TEST 2108
 */
public class Node {
	
	private Drink data;
	private Node next;
	
	public Node(){
		this(new Drink(0,"",0.2f));
		next = null;
	}
	
	

	public Node(Drink data) {
		super();
		this.data = data;
		next = null;
	}



	public Drink getData() {
		return data;
	}



	public void setData(Drink data) {
		this.data = data;
	}



	public Node getNext() {
		return next;
	}



	public void setNext(Node next) {
		this.next = next;
	}



	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
	
	
	
	
	
	

}
