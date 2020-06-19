
public class GoodInShop extends Goods{
	
	private int amount;

	

	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount)throws ErrorException{
		if(amount < 0) {
			throw new ErrorException("Amount Can't be negative");
		}
		this.amount = amount;
	}



	public GoodInShop(String name, double cost, int k) {
		super(name, cost);
		
		this.amount = k;
	}



	@Override
	public String toString() {
		return " "+amount;
	}
	
}
