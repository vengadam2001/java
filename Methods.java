class Methods{
    int getArea(int a, int b){
        return a*b;
    }
    static int get_Area(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Methods obj=new Methods();
        int area=obj.getArea(5,10);
        int area_=Methods.get_Area(5,10);
        System.out.println(area);
        System.out.println(area_);
    }
}