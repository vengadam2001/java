public class kickoutRahul{
    public static void main(String agrs[])
    {
        try{
            Scanner i=new Scanner(System.in);
            System.out.println("enter your name ");
            String name=i.nextLine();
            if String.equals(name,"Rahul"){
                throw Exception;
            } 
            else{
                System.out.println("Welcome to my program "+name);
            }
        }
        catch( Exception e){
            System.out.println("please quit the program");
        }
    }
}