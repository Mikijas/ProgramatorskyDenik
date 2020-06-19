
public class ShoppingList implements SimpleList{
	int block = 0;
	private Object array[] = new Object[10];
	@Override
	public void add(Object a) {
		if(block >= array.length-1) {
			Object biggerArray[] = new Object[array.length*2];
			for(int i = 0; i < block; i++) {
				biggerArray[i] = array[i];
			}
				array = biggerArray;
				array[this.block] = a;
				block ++;
			}else {
				array[this.block] = a;
				block ++;
			}
		}
		// TODO Auto-generated method stub
		
	

	@Override
	public void remove(int i) throws ErrorException {
		if(i < 0 && i > block) {
			throw new ErrorException("You can't remove something, that doesn't exist !!!");
		}
		int help = i;
		array[i] = null;
		for(int j = help; j < block; j ++) {
			array[j] = array[j+1];
		}
		
	}

	@Override
	public Object get(int i) throws ErrorException {
		if(i < 0 && i > block) {
			throw new ErrorException("You can't get something, that doesn't exist !!!");
		}
		
		return array[i];
	}

	@Override
	public int size() {
		
		return this.block;
	}
	public void syssout() {
		for(int i = 0; i < this.block; i++) {
			System.out.println(array[i]);
			System.out.print("");
		}

}
	
}
