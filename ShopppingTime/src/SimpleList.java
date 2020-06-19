
public interface SimpleList<T> {
	public void add(T a);
	public void remove(int i) throws ErrorException;
	public T get(int i) throws ErrorException;
	public int size();
}
