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
    System.out.println("Bike :  Untitled1:29 - program977.java:30"+getNumber());
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
    System.out.println("Car:  Untitled1:40 - program977.java:42"+getNumber());
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
    System.out.println("Truck:  Untitled1:52 - program977.java:55"+getNumber());
  }
  
}

class program977
{
    public static void main(String A[])
    {
     Car cobj = new Car("MH12VL9080");
     cobj.display();
     Truck tobj = new Truck("MH12WZ9080");
     tobj.display();
    }
}