//using fb as an example click to view ur frnd list everybody as a variable name of friends 
//iterate over each friend to display their name
import java.util.*;
class Facebook2{
    public static void main(String args[]){
        String users[]={"A","B","C","D","E","F"};
        String friends[][]={{"B","C","D"},{"A","E","F"},{"A","D","E"},{"A","C"},{"C"},{"B"}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username:");
        String keyUser=sc.nextLine();
        boolean flag=false;
        for(int i=0;i<5;i++){
            if(keyUser.equals(users[i])){
                flag=true;
                System.out.println("The friends of "+keyUser+":");
                System.out.println(Arrays.toString(friends[i]));
                break;
            }
        }
        if(!flag){
            System.out.println(keyUser+": User does not exist");
        }
    }
}