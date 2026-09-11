//singleton design pattern
class ParkingLot
{
    private static ParkingLot instance;
    
    private ParkingLot()
    {
     System.out.println("parkinglot object created  program970.java:7  Untitled1:7  program971.java:7  Untitled1:7  Untitled2:8  program973.java:8  Untitled1:8 - program974.java:8");    
    }

    public static ParkingLot getInstance()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }
        return instance;
    }
}
class program974
{
    public static void main(String A[])
    {
     
      ParkingLot pobj1 = ParkingLot.getInstance();
      ParkingLot pobj2 = ParkingLot.getInstance();
      
      System.out.println(pobj1 == pobj2);
    }
}