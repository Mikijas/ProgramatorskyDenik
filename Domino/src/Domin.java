
public class Domin {

	private int RightDomin;
	private int LeftDomin;
	
	public int getRightDomin() {
		return RightDomin;
	}
	public void setRightDomin(int rightDomin) {
		RightDomin = rightDomin;
	}
	public int getLeftDomin() {
		return LeftDomin;
	}
	public void setLeftDomin(int leftDomin) {
		LeftDomin = leftDomin;
	}
	public Domin(int leftDomin, int rightDomin) {
		
		RightDomin = rightDomin;
		LeftDomin = leftDomin;
	}
	@Override
	public String toString() {
		return "( " + LeftDomin + ", " + RightDomin + " )";
	}

	
	
	
}
