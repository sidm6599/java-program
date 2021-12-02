package p6;
class outer
{
  public void display()
  {
    System.out.println("outer class");
  }

  // this class is nested class declared inside the outer class
  class inner
  {
    public void display()
    {
      System.out.println("inner class");
    }
  }
}
public class Test68 {
  public static void main(String[] args) {
    outer obj = new outer();
    obj.display();

    outer.inner obj2 = obj.new inner();  // important statement kindly understant it carefully

    obj2.display();
  }
}
