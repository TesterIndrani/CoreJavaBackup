package abstractionProgram;

public class Mobile_Driver {
 public static void main(String[] args) {

	//Mobile m1 = new Mobile();  Cannot create object for Abstract class
	Nokia n1 = new Nokia();
	//As all the methods of Mobile class are overriden by Nokia class, Nokia class methods will be called below.
	n1.camera();	
	n1.screen();
	n1.ram();
 }
	}
