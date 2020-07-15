import java.util.*;
class UseOrder extends ShippedOrder{
    void user_meth(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n1 to place new order\n2 to customize your order\n3 to confirm your order\n0 to exit");
            System.out.print("\nEnter your choice:");
            int ch=sc.nextInt();
            if(ch==0){
                System.out.println("\nThank You!\n");
                System.out.println("\n\t\t\t\tHarshini S E0119002");
                break;
            }
            switch(ch){
                case 1:
                //System.out.print("Enter customer name:");
                //setCustomerName(sc.nextLine());
                //sc.nextLine();
                setCustomerName();
                System.out.print("Enter customer number:");
                setCustomerNumber(sc.nextInt());
                System.out.print("Enter quantity:");
                setQuantity(sc.nextDouble());
                System.out.print("Enter unit cost:");
                setUnitCost(sc.nextDouble());
                System.out.println("Details Taken\n");
                break;

                case 2:
                System.out.println("The current order quantity is: "+getQuantity());
                System.out.print("Enter the quantity you want to change to:");
                setQuantity(sc.nextDouble());
                System.out.println("The current unit cost is: "+getUnitCost());
                System.out.print("Enter the quantity you want to change to:");
                setUnitCost(sc.nextDouble());
                System.out.println("Updated the Details!");
                System.out.println();
                break;

                case 3:
                System.out.println("Order is Confirmed!");
                System.out.println("Customer Name:\t"+getCustomerName());
                System.out.println("Customer Number:"+getCustomerNumber());
                System.out.println("Quantity:\t"+getQuantity());
                System.out.println("Final Charge:\t"+computePrice());
                System.out.println();
                break;

                default:
                System.out.println("Invalid Choice! Please try again!");
                System.out.println();
            }
        }
    }

    public static void main(String args[]){
        UseOrder u=new UseOrder();
        u.user_meth();
    }
}
class Order{
    String customerName;
    private int customerNumber;
    private double quantity;
    private double unitCost;
    //Scanner sc;
    void setCustomerName(){
        //this.customerName=customerName;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name:");
        customerName=sc.nextLine();
        sc.nextLine();
    }

    String getCustomerName(){
        return customerName;
    }

    void setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
    }

    int getCustomerNumber(){
        return customerNumber;
    }

    void setQuantity(double quantity){
        this.quantity=quantity;
    }

    double getQuantity(){
        return quantity;
    }

    void setUnitCost(double unitCost){
        this.unitCost=unitCost;
    }

    double getUnitCost(){
        return unitCost;
    }

    double computePrice(){
        return getQuantity()*getUnitCost();
    }
}

class ShippedOrder extends Order{
    private final int shipping_handling_charge=4;
    double computePrice(){
        return super.computePrice()+shipping_handling_charge;
    }
}

