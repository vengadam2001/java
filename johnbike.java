class Yamaha extends johnbike{ 

    String BikeName ="Yamaha FZ-S"; 

    double EngineCC =149; 

    double Price =97480; 

    double Mileage =50 ;  

    String EnginePower="13.2 PS @ 8000 rpm";  

} 

class Bajaj extends johnbike{ 

    String BikeName ="Bajaj Pulsar"; 

    double EngineCC =149.5; 

    double Price =90500; 

    double Mileage = 65;  

    String EnginePower="14 PS @ 8000 rpm";  

} 

class Honda extends johnbike{ 

    String BikeName ="Honda Cornet"; 

    double EngineCC =162.71; 

    double Price =94716; 

    double Mileage = 42.85;  

    String EnginePower="15.09 PS @ 8500 rpm";  

} 

public class johnbike { 

    String Enginetype ="4 Stroke"; 

    String FuelType = "Petrol"; 

    int Noofgears = 5; 

    String Transmissiontype ="Manual";  

public static void main(String[] args) { 

    Yamaha y=new Yamaha(); 

    Bajaj b=new Bajaj(); 

    Honda h= new Honda(); 

    System.out.println("enginetype \t fueltype  \t Noofgears \t Transmissiontype \t BikeName \t  EngineCC \t Price\t Mileage \t EnginePower "); 
    System.out.println(y.Enginetype +"\t"+y.FuelType+"\t" + y.Noofgears+"\t"+ y.Transmissiontype+"\t"+ y.BikeName +"\t"+y.EngineCC+"\t"+ y.Price+"\t"+y.Mileage+"\t"+y.EnginePower);
    System.out.println(b.Enginetype +"\t"+b.FuelType+"\t" + b.Noofgears+"\t"+ b.Transmissiontype+"\t"+ b.BikeName +"\t"+b.EngineCC+"\t"+ b.Price+"\t"+b.Mileage+"\t"+b.EnginePower);
    System.out.println(h.Enginetype +"\t"+h.FuelType+"\t" + h.Noofgears+"\t"+ h.Transmissiontype+"\t"+ h.BikeName +"\t"+h.EngineCC+"\t"+ h.Price+"\t"+h.Mileage+"\t"+h.EnginePower);
 
 

} 

} 

 