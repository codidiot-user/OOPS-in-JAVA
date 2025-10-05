class Exam{
  private  int rno;
  private String name;
    Exam(int rno, String name){
        this.rno = 21;
        this.name = "First";
    }
    void stu(){
        System.out.println(rno);
    }
}


public class Main{
    public static void main(String[]args){
        Exam a1 = new Exam(21, "First");
        a1.stu();
    }
}
