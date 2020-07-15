class Zero
{
public void eat()
	{
		System.out.println("Zero");
	}
}
class One extends Zero
{  
  public void eat()
    {
      System.out.println("one");
      super.eat();    	
    }
 }
class Two extends One
{
	public void eat()
	{
		System.out.println("two");
		super.eat();
	}
}


public class Over_riding extends Two{

   public static void main(String agrs[])
  {
  Two t=new Two(); 
  t.eat();
  t.eat()

  }
}