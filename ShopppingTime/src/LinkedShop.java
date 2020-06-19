
public class LinkedShop<T>{
	Node<T> previous = null;
	Node<T> next = null;
	public void add(T data) {
		Node<T> nhead = new Node<T>( previous, data, next);
		previous = next;
		next = nhead;
	}
	public T pop() {
		T ret = next.getValue();
		next = next.getNext();
		return ret;
	}

}
