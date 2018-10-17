import java.util.Arrays; 

public class ArrayStack implements Stack {

	private Object[] arr; 
	private int top; 

	public static void main(String[] args) {
		ArrayStack as = new ArrayStack(); 
		for (int i = 0; i <= 10; i++) {
			as.push(i); 
		}
		System.out.println(Arrays.toString(as.getArr())); 
	}

	public Object[] getArr() {
		return this.arr; 
	}

	public ArrayStack() {
		top = -1; 
		arr = new Object[10]; 
	}

	public void push(Object obj) {
		if (top == arr.length - 1) {
			grow_array(); 
		} 
		arr[++top] = obj; 
	}

	public Object pop() {
		return arr[top--]; 
	}

	public Object peek() {
		return arr[top]; 
	}

	public boolean empty() {
		return top == -1; 
	}

	private void grow_array() {
		Object[] newArr = new Object[arr.length * 2]; 
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i]; 
		}
		arr = newArr; 
	}
}