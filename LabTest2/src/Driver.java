

/*
 * 
 * 
 * AUTHOR: RICARDO GAYNOR
 * UTECH 
 * DATA STRUCTURES LAB TEST 2108
 */
public class Driver {
	
	public static void main(String[] args){
		
		
		Drink[] drink = new Drink[4];
		
		float f = (float) 23.45;
		
		for(int i = 0; i < drink.length; i++){
			 drink[i] = new Drink((i+1), "Flavour " + (i +1), (1+i) * f);
		}
		
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		for(int i = 0; i < drink.length; i++){
			 stack.push(drink[i]);
			 System.out.println("adding Dring: " + (i+1) + " to the Stack");
		}
		
		
		System.out.println();
		System.out.println("***********************************");
		
		for (int i = 0; i < 2; i++){
			queue.enqueue(stack.pop());
			System.out.println("adding Dring: " + (i+1) + " to the Queue");
		}
		
		System.out.println();
		System.out.println("***********************************");
		
		System.out.println(" Number of items in stack " +countQueItemps(queue));
		
		System.out.println();
		System.out.println("***********************************");
		
		System.out.println(" Total cost of Drinks " +sumStackItems(stack));

		
		System.out.println();
		System.out.println("***********************************");
		 
		
		queue.destroy();
		stack.destroy();
		
		 
	}
	
	public static int countQueItemps(Queue queue){
		int i = 0;
		Queue tempQueue = new Queue();
		while(!queue.isEmpty()){
			tempQueue.enqueue(queue.dequeue());
			i++;
		}
		
		while(!tempQueue.isEmpty()){
			queue.enqueue(tempQueue.dequeue());
		}
		return i;
		
	}
	
	
	public static float sumStackItems(Stack satck){
		float totalCost = 0.2f;
		Drink drink = null;
		Stack tempStack = new Stack();
		while(!satck.isEmpty()){
			drink = satck.pop();
			totalCost += drink.getCost();
			tempStack.push(drink);
		} 
		
		
		while(!tempStack.isEmpty()){
			satck.push(tempStack.pop());
		}
		
	return totalCost;
	
	}

}
