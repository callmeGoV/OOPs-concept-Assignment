class CarClass{
    String carName;
    
    CarClass(String name)
    {
     this.carName = name;

    }
 }
 class Driver extends CarClass{
    String driverName;
    Driver(String name, String cname){
     super(cname);
     this.driverName=name;
    }
 }
 class TransportCompany{
    public static void main(String args[])
    {
     Driver obj = new Driver("Andy", "Ford");
     System.out.println(obj.driverName+" is a driver of car "+obj.carName);
    }
 }