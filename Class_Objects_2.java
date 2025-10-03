package OOPS;

public class Class_Objects {
	public static void main(String[]args) {
		Student loki = new Student(21, "Logesh", 82.1);
		Student random = new Student(loki); //--> This will make a copy of the existing class
		System.out.println(random.rno);
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
	Student(){ // CONSTRUCTOR class Which has no parameter passed
		this.rno = 25;
		this.name = "Logesh";
		this.mark = 99.4;
	}
	Student(Student other){  // This is the copy of the existing class
		this.rno = other.rno;
		this.name = other.name;
		this.mark = other.mark;
	}
	Student(int rno, String name, double mark){
		this.rno = rno;
		this.name = name;
		this.mark = mark;
	}
}
