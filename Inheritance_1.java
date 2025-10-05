class Animal{
    void ani(){
        System.out.println("Common");
    }
    
}
class Dog extends Animal{
    void dog(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meow");
    }
}

public class Main
{
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Dog a2 = new Dog();
		Cat a3 = new Cat();
		a1.ani();
		a2.dog();
		a3.meow();
	}
}
