public class Main{
    public static void main(String[]args){
        Exam a1 = new College();
        a1.hall();
        a1.exam();
    }
}
interface Exam{
    void hall();
    void exam();
    
}
class College implements Exam{
    public void hall(){
        System.out.println("The hall is...");
    }
    public void exam(){
        System.out.println("Exam is started");
    }
}

