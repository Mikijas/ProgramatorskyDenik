public class Cube {
 
	int a;

	public Cube(int a) {
		this.a = a;
	}

	public Cube() {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
	public String toString(/*String z*/) {
		return "Cube [ a= " + a + " Objem = " +s()+ " Povrch= " + p() +/* " " + z +*/"]";
		
	}
	
	public int s() {
		return  Math.toIntExact(this.a*this.a*this.a);
	}
	public int p() {
		return  Math.toIntExact(this.a*this.a*6);
	}
	
}
