package arrayListPrograms;

import java.util.Stack;

public class A5Stack {
public static void main(String[] args) {
	
	Stack s1 = new Stack();
	s1.push(10);
	s1.push('g');
	s1.push("Hello");
	s1.push(false);
	
	System.out.println(s1);
	System.out.println("The removed object="+s1.pop());
	System.out.println(s1);
	System.out.println("The element at the top="+s1.peek());
	
}
}
