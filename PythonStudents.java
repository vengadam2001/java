import java.util.*;
class PythonStudents{
    String UID,studentName;
    int pythonMark;
    
    PythonStudents(){}
    
    PythonStudents(String id,String name,int mark){
        UID=id;
        studentName=name;
        pythonMark=mark;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int ch;
        PythonStudents ps=new PythonStudents();
        while(count<=10){
            System.out.println("\nEnter 1 to add details of new student");
            System.out.println("Enter 2 to view details of last student");
            System.out.print("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    count++;
                    ps=null;
                    System.gc();
                    sc.nextLine();
                    System.out.println("\nEnter the UID:");
                    String id=sc.nextLine();
                    
                    System.out.println("Enter the name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the mark:");
                    int mark=sc.nextInt();
                    ps=new PythonStudents(id,name,mark);
                    System.out.println("DETAILS ADDED!\n");
                    if(count==10){
                        System.out.println("Memory Full!");
                    }
                    break;
                
                case 2:
                    if(count==0){
                        System.out.println("\nNo previous student detail available!");
                    }
                    else{
                        System.out.println("\nStudent UID:"+ps.UID);
                        System.out.println("Student Name:"+ps.studentName);
                        System.out.println("Python Mark:"+ps.pythonMark);
                    }
                    break;
                    
                default:
                    System.out.println("Invalid Choice!Enter again!");
            }
        }
    }
}