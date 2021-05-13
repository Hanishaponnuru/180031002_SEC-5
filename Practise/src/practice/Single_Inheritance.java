package practice;

class Bank{
	void displayamount(){
		System.out.println("Amt is 1000");
	}
}
class AccBalance extends Bank{
	void account()
	{
		System.out.println("This is my account");
	}
}
public class Single_Inheritance {
	public static void main(String args[])
	{
		Bank acc=new AccBalance();
		//acc.account();
		acc.displayamount();
	}

}