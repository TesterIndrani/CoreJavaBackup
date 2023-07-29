//ascending order removal of elements in Priority Queue
package SetPrograms;

import java.util.PriorityQueue;

public class A9 {
public static void main(String[] args) {
	PriorityQueue l1 = new PriorityQueue();
	l1.offer(12);
	l1.offer(56);
	l1.offer(22);
	l1.offer(90);
	l1.offer(6);
	l1.offer(78);
	l1.offer(45);
	l1.offer(61);
	
	System.out.println(l1);
	while(!(l1.isEmpty()))
	{
		System.out.println(l1.poll());
	}
}
}
