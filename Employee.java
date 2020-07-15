
class Employee{
    public void finalize(){
        System.out.print("memory cleared");
    }
    int id=30;
    String name="stv";
    String desg="senior manager";
    String dept="engineering ";
    void typeofwork(){
        System.out.println("Professor");
    }
    void  login(){
        System.out.println("your login time is:"+" "+java.time.LocalDateTime.now());
    }
    public static void main(String agrs[])
    {
        Employee a=new Employee();
        a.login();
        a.typeofwork();
        System.out.println("name: "+a.name);
        System.out.println("designation: "+a.desg);
        System.out.println("department: "+a.dept);
        a=null;
        System.gc();
    }
}