// observer type of pattern

interface ParkingObserver
{
  void update (int availableSpots);
  
}
class DisplayBoard implements ParkingObserver
{
  public void update(int availableSpots)
  {
    System.out.println("DisplayBoard :  Untitled1:13 - program994.java:12"+availableSpots);
  }
}
class MobileApplication implements ParkingObserver
{
  public void update(int availableSpots)
  {
    System.out.println("MobileApplication:  Untitled1:20 - program994.java:19"+availableSpots);
  }
}
class ParkingFloor
{
  private int availableSpots;

  public ParkingFloor(int availableSpots)
  {
    this.availableSpots = availableSpots;
  }
}

class program994
{
    public static void main (String A[])
    {
     ParkingFloor floor = new ParkingFloor(5); 
    }
}