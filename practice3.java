import java.util.Scanner;


public class Employee {
  
  private int eid;
  private String ename; 


  public int getEid() {
    return eid;
  }
  public void setEid(int eid) {
    this.eid = eid;
  }
  public String getEname() {
    return ename;
  }
  public void setEname(String ename) {
    this.ename = ename;
  }
} 

class EmployeeMain
{
  public static void main(String[] args) {
    
    Employee obj = new Employee();
    Scanner s = new Scanner(System.in);
   
    obj.setEid(s.nextInt());
    obj.setEname(s.next());
    System.out.println(obj.getEid());
    System.out.println(obj.getEname());
  }
}
