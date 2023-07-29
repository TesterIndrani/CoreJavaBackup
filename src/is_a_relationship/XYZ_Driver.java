package is_a_relationship;

public class XYZ_Driver {
public static void main(String[] args) {
	X obj1 = new X();//parent of Y, grandparent of Z
	obj1.i=100;
	System.out.println("i of class X="+obj1.i);
	System.out.println("a of class X="+X.a);
	//System.out.println(obj1.b+" "+obj1.j);
	//System.out.println(obj1.c+" "+obj1.k);
	
	Y obj2 = new Y();
	System.out.println("i of class Y="+obj2.i);
	obj2.i=101;
	System.out.println("i of class Y="+obj2.i);
	obj2.j=200;
	System.out.println("j of class Y="+obj2.j);
	System.out.println("Static members a,b of class Y through classname="+Y.a+" "+Y.b);//a belongs to parent class X
	System.out.println("Static members of a,b of class Y through object="+obj2.a+" "+obj2.b);//a is static member of X class
	
	Z obj3 = new Z(); //child
	obj3.i=102;
	obj3.j=201;
	obj3.k=300;
	System.out.println("Non static members i,j,k of class Z are="+obj3.i+" "+obj3.j+" "+obj3.k);
	System.out.println("Static members a,b,c of class Z through classname are="+Z.a+" "+Z.b+" "+Z.c);
	System.out.println("Static members a,b,c of class Z through object are="+obj3.a+" "+obj3.b+" "+obj3.c);
	
}
	
}
