//Homogeneous Collection
package arrayListPrograms;
import java.util.ArrayList;

public class A2 {
public static void main(String[] args) {
	ArrayList<Character> a1= new ArrayList<>();
	a1.add('k');
	a1.add('p');
	a1.add('s');
	a1.add('m');
	
	for(int i=0; i<a1.size(); i++)
		System.out.print(a1.get(i)+" ");
}
}
