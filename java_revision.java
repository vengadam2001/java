// #class
// a template or blueprint 
// variable is a pice of memory that stores data 
// data types -
// primary
//     int char boolean double long short float  String
// secondry
    // array 
// object creation for inner class 
// out class out =new outclass 


class java_revision {
    
    public static int add(int a , int b){
        return(a+b);
    }
    public static void main(String args[])
    {
        System.out.println("the sum is:"+" "+add (2,5));
        new  hello ();

    }
    
}
class hello {
    hello (){
        java_revision a = new java_revision();
        System.out.println(a.add(2,9));
    }
}