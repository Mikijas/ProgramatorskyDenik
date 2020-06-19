
public class Node<T> {

	Node<T> next;
	T value;
	Node<T> previous;
	public Node(Node<T> previous, T value, Node<T> next) {
		
		
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getPrevious() {
		return previous;
	}
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

}
