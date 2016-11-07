/**
* Problem 11.10 Class
* MyStack Class
* Garrett Meyer
*/
import java.util.ArrayList;
public class MyStack  extends ArrayList<Object> {

	public Object peek() {
		return get(size() - 1);
	}
	public Object pop() {
		Object r = get(size() - 1);
		remove(size() - 1);
		return r;
	}
	public void push (Object r) {
		add(r);
	} 
	public String toString() {
		return "Stack: " + super.toString();
	}
}