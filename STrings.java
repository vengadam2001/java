public class STrings {
    public static void main(String args[]) {
        String s="java";
        String s1="program";
        String s2=s+s1;
        System.out.println(s2+" length :"+s2.length());
        String s3=s2.replace("java"," python ");
        System.out.println(s3);
        s3=s3.toUpperCase();
        System.out.println(s3);
        s3=s3.toUpperCase();
        System.out.println(s3);
        s3="java Program";
        System.out.println("index of o:"+(int)s3.indexOf('o'));
    }    
}