package OOPS;

public class Class_Objects {
	public static void main(String[]args) {
		Student loki = new Student(21, "Logesh", 82.1);
		System.out.println(loki.rno);
		System.out.println(loki.name);
		System.out.println(loki.mark);   // Here the '.' is called as SEPARATOR or DOT operator!!
		loki.greet();
	}
}
class Student {
	int rno;
	String name;
	double mark;
	void greet() {
		System.out.println("Hello! This is "+name);
	}
	Student(){  // CONSTRUCTOR class
		this.rno = 21;
		this.name = "Logesh S";
		this.mark = 82.1f;
//	}
	Student(int rno, String name, double mark){
		this.rno = rno;
		this.name = name;
		this.mark = mark;
	}
}
