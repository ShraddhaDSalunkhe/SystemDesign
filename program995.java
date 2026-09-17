// observer type of pattern

interface ParkingObserver
{
  void update (int availableSpots);
  
}
class DisplayBoard implements ParkingObserver
{
  public void update(int availableSpots)
  {
    System.out.println("DisplayBoard :  Untitled1:13  program994.java:12  Untitled1:12 - program995.java:12"+availableSpots);
  }
}
class MobileApplication implements ParkingObserver
{
  public void update(int availableSpots)
  {
    System.out.println("MobileApplication:  Untitled1:20  program994.java:19  Untitled1:19 - program995.java:19"+availableSpots);
  }
}
class ParkingFloor
{
  private int availableSpots;
  private List<ParkingObserver> observers = new ArrayList<>();

  public ParkingFloor(int availableSpots)
  {
    this.availableSpots = availableSpots;
  }
  public void addObserver(ParkingObserver observer)
  {
    observers.add(observer);
  }
  public void removeObserver(ParkingObserver observer)
  {
    observers.remove(observer);
  }
  public void vehicleParked()
  {
    availableSpots--;
    notifyObserver();
  }
  public void vehicleExited()
  {
    availableSpots++;
    notifyObserver();
  }
  private void notifyObserver()
  {
    for(ParkingObserver observer:observers)
    {
      observer.update(availableSpots);
    }
  }
}

class program995
{
    public static void main (String A[])
    {
     ParkingFloor floor = new ParkingFloor(5); 

     DisplayBoard board = new DisplayBoard();
     MobileApplication app = new MobileApplication();

     floor.addObserver(board);
     floor.addObserver(app);

     floor.vehicleParked();
     System.out.println("_________________________________________________d1:71  Untitled1:71 - program995.java:71");
     floor.vehicleExited();
    }
}