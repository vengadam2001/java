//while creating the obj of the class 
//if nothing is passed to it, then the message I love pgming language should be printed
//if some str is passed to it, then in place of pgming lang, the value of the str var shud be printed
//for ex, while creating obj, if we pass java, then i love java shud be printed.
class Programming{
    Programming(){
        System.out.println("I love programming language");
    }
    Programming(String str){
        System.out.println("I love "+str);
    }
    public static void main(String args[]){
        Programming pg1=new Programming();
        Programming pg2=new Programming("Java");
    }
}