class Animal{
    void dog_nature(){ // THE METHOD NAME SHOULD SAME TO DO PERFORM OVERRIDE FUNCTION
        System.out.println("Bark");
    }
}
class Dog extends Animal{
    @Override
    void dog_nature(){ // THE METHOD NAME SHOULD SAME TO DO PERFORM OVERRIDE FUNCTION
        System.out.println("Bit");
    }
}
class Cat extends Animal{
    @Override
    void dog_nature(){   // THE METHOD NAME SHOULD SAME TO DO PERFORM OVERRIDE FUNCTION
        System.out.println("Meow");
    }
}


public class Main
{
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		a1.dog_nature();
		a2.dog_nature();
		a3.dog_nature();
	}
}
