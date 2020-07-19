class oldTv {
    int Width=1920;
    int Height=1080;
    int Screensize_inch=42;
    String type ="LCD";
    void show(){
        System.out.println("Height :"+Height);
        System.out.println("Width:"+Width);
        System.out.println("Screen Size in Inch:"+Screensize_inch);
        System.out.println("Display technology :"+type);
    }
}
class newTv extends oldTv{
    boolean usb_port=true;
    int usbno =2;
    void show(){
        super.show();
        System.out.println("Has USB Port:"+usb_port);
        System.out.println("No Of USB Ports :"+usbno);
    }
}
public class Television {
    public static void main(String[] args) {
        newTv LG=new newTv();
        LG.show();
    }

}