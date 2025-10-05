class Exam{
  private  int rno;
  private String name;
    Exam(){
        this.rno = 21;
        this.name = "First";
    }
    void stu(){
        System.out.println(rno);
    }
}


public class Main{
    public static void main(String[]args){
        Exam a1 = new Exam();
        a1.stu();
    }
}
