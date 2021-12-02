import java.util.Scanner;
class expdemo
{
	void func1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the 1 value");
		int var1=sc.nextInt();
		System.out.println("enetr the 2 value");
		int var2=sc.nextInt();
		int res=var1/var2;
		System.out.println("Division  "+res);
	}
	void func2()
	{
		System.out.println("Second fn is working");
	}
	public static void main(String args[])
	{
		expdemo obj=new expdemo();
		obj.func1();
		obj.func2();
	}
}
