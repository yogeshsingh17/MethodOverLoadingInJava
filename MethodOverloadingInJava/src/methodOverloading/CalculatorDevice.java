package methodOverloading;

class Calculator
{
	
	public int addition(int a,int b)
	{
		return a+b;
	}
	
	public int addition(int a,int b, int c)
	{
		return a+b+c;
	}
	
}

public class CalculatorDevice {

	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		System.out.println("The sum of three interes is: ");
		System.out.println(c.addition(5, 6, 7));
		
		System.out.println();
		
		System.out.println("The sum of two integers is: ");
		System.out.println(c.addition(10, 20));

		
	}

}
