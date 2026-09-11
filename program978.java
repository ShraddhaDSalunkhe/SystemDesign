enum VehicleType 
{
  BIKE,
  CAR, 
  TRUCK
}

abstract class Vehicle
{
  private String number;
  public Vehicle(String number)
  {
    this.number = number;
  }
  public String getNumber()
  {
    return this.number;
  }
  public abstract void display();
}

class Bike extends Vehicle
{
  public Bike(String number)
  {
    super(number);
  }
  public void display()
  {
    System.out.println("Bike :  Untitled1:29  program977.java:30  Untitled1:30 - program978.java:30"+getNumber());
  }
}

class Car extends Vehicle
{
  public Car(String number)
  {
    super(number);
  }
  public void display()
  {
    System.out.println("Car:  Untitled1:40  program977.java:42  Untitled1:42 - program978.java:42"+getNumber());
  }
  
}

class Truck extends Vehicle
{
  public Truck(String number)
  {
    super(number);
  }
  public void display()
  {
    System.out.println("Truck:  Untitled1:52  program977.java:55  Untitled1:55 - program978.java:55"+getNumber());
  }
  
}

class VehicleFactory
{
  public static Vehicle createVehicle(VehicleType type, String number)
  {
    switch(type)
    {
      case BIKE: 
          return new Bike(number);
      case CAR:
          return new Car(number);
      case TRUCK:
          return new Truck(number);
          //default missing error
    }
    
  }
}

class program978
{
    public static void main(String A[])
    {
      Vehicle v1 = VehicleFactory.createVehicle(VehicleType.BIKE,"MH12VL9080");
      Vehicle v2 = VehicleFactory.createVehicle(VehicleType.CAR,"MH12WZ9080");
      Vehicle v3 = VehicleFactory.createVehicle(VehicleType.TRUCK,"MH12ML9080");

      v1.display();
      v2.display();
      v3.display();

    }
}