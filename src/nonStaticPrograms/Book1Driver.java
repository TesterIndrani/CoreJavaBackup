package nonStaticPrograms;

public class Book1Driver {
	
		public static void main(String[] args) {
			
			Book1 b1 = new Book1("The Alchemist",468,"Paulo Coelho",299.0);
			System.out.println(b1);
			b1.display();

			System.out.println("******************");

			Book1 b2 = new Book1("C++",508,"Sumit Arora");
			System.out.println(b2);
			b2.display();
			
			System.out.println("******************");

			Book1 b3 = new Book1("JAVA",301);
			System.out.println(b3);
			b3.display();
			
			System.out.println("******************");

			Book1 b4 = new Book1("The Old Man and the Sea");
			System.out.println(b4);
			b4.display();

	}
}
