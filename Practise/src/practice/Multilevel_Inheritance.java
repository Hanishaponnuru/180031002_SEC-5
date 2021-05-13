package practice;

class Animal{
	void eat(){
		System.out.println("only vegetables");
	}
}
class  Dog extends Animal{
	void sound()
	{
		System.out.println("Bark");
	}
}
class  Cat extends Dog{
	void slepps()
	{
		System.out.println("cat sleeps");
	}
}


public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cat c=new Cat();
     c.eat();
     c.sound();
     c.slepps();
	}

}