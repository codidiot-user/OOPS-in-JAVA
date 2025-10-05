class Calculator{
    int add(int a, int b){
        return a+b;
    }
    long add(long a, long b){
        return a-b;
    }
    double add(double a, double b){
        return a/b;
    }
}





public class Main
{
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(5,9));
		System.out.println(c1.add(5,9));
	}
}
