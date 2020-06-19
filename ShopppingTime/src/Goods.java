
public class Goods {

	private String name;
	private double cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(int cost)throws ErrorException{
		if(cost < 0) {
			throw new ErrorException("Amount Can't be negative");
		}

		this.cost = cost;
	}
	@Override
	public String toString() {
		return name + " " + cost + "€";
	}
	public Goods(String name, double d) {
		super();
		this.name = name;
		this.cost = d;
	}
	
	
}
