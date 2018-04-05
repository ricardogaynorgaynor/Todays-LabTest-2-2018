

/*
 * 
 * AUTHOR: RICARDO GAYNOR
 * UTECH 
 * DATA STRUCTURES LAB TEST 2108
 */

public class Drink {
	
	private int id;
	private String flavour;
	private float cost;
	
	public Drink(){
		this(0,"",0.0f);
	}
	
	
	public Drink(int id, String flavour, float cost) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.cost = cost;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Drink [id=" + id + ", flavour=" + flavour + ", cost=" + cost
				+ "]";
	}
	
	
	

}
