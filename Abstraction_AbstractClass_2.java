abstract class Exam{
    abstract void hall();
    void exam(){
        System.out.println("Exam is today");
    }
    
}
class College extends Exam{
    void hall(){
        System.out.println("No. of presejt");
    }
}

public class Main
{
	public static void main(String[] args) {

	    Exam a1 = new College();
	    a1.hall();
	    a1.exam();  // WAY TO CALL THE 'EXAM' CLASS
	}
}
