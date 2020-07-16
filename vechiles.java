class bike {
    void display(){
        System.out.println("Printed from the bike class");
    }
}
class hero extends bike{
void display(){
    super.display();
    System.out.println("Printed from the hero class");
}
}
public class vechiles {
    public static void main(String agrs[]){
        hero a=new hero();
        a.display();
        System.out.println("your login time is:"+" "+java.time.LocalDateTime.now());
    }
}