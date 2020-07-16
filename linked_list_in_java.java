import java.util.Arrays;
import java.util.Scanner;
class sample1 {
   public static void main(String agrs[])
   {
ll l=new ll();
l.adduser();
   }
}
class ll
       {
   node last=null;
   node first=null;
   node user=null;
   void friendoffriend(){
       node friend=null;
       Scanner input =new Scanner(System.in);
       System.out.println("enter the friend id to see his friends");
       friend.id=input.nextInt();
       friend=this.search(friend.id);
       for (int i=0;i<user.friends.length;i++){
           System.out.println(user.friends[i].user);
       }
   }
   void adduser(){
       if (first==null && last ==null) {
           last.append(last);
           first = last;
       }
       else{
           last.append(last);
       }
   }
   void addfriend(node users){
       node friend=null;
       System.out.println("enter your friend's id ");
       Scanner input = new Scanner(System.in);
       friend.id=input.nextLong();
       friend=this.search(friend.id);
       user.nooffriends+=1;
       users.friends=Arrays.copyOf(users.friends,friend.nooffriends);
       user.friends[user.nooffriends]=friend;
       if (friend==null)System.out.println("not found");
       else System.out.println("friend added");
       input.close();
   }
   node search(long id){
       node temp=null;
       while(temp != null){
           if (temp.id ==id)
               return(temp);
           temp=temp.next;
       }
       return(null);
   }
       }
class node
{
   String user;
   long id;
   int nooffriends=0;
   node next=null,friends[]=null;
   public node append(node last)
   {
       last.next=new node();
       Scanner input = new Scanner(System.in);
       System.out.print("enter your username:");
       last.next.user=input.next();
       last.next.id = last.id + 1;
       last = last.next;
       input.close();
       return last;
   }
}
