interface Aktuuniversity
{
	abstract void btech();
	static void func()
	{
		System.out.println("static fn is working in interface");
	}
}
interface LPU
{
	abstract void mtech();
	public void mba();
}
class college8 implements Aktuuniversity,LPU
{
	public void btech()
	{
		System.out.println("btech prog..");
	}
	public void mtech()
	{
		System.out.println("mtech prog..");
	}
	public void mba()
	{
		System.out.println("mba prog..");
	}
	public static void main(String args[])
	{
		college8 obj=new college8();
		obj.btech();
		obj.mtech();
		obj.mba();
		Aktuuniversity.func();
	}
}
