
class ParkingTicket
{
    private  int ticketNumber;
    private  String vehicleNumber;
    private  int floorNumber;
    private  int spotNumber;
    private  String entryTime;

    /*public ParkingTicket(int a, String b, int c, int d, String e)
    {
        this.ticketNumber = a;
        this.vehicleNumber = b;
        this.floorNumber = c;
        this.spotNumber = d;
        this.entryTime = e;

    }*/
   public ParkingTicket(Builder builder)
   {
    this.ticketNumber = builder.ticketNumber;
    this.vehicleNumber = builder.vehicleNumber;
    this.floorNumber = builder.floorNumber;
    this.spotNumber = builder.spotNumber;
    this.entryTime = builder.entryTime;
   }
    public void display()
    {
        System.out.println("Ticket number :  program985.java:21  Untitled1:21    Builder.java:29  program986.java:29  Untitled2:29 - program987.java:29"+this.ticketNumber);
        System.out.println("vehicle number :  program985.java:22  Untitled1:22    Builder.java:30  program986.java:30  Untitled2:30 - program987.java:30"+this.vehicleNumber);
        System.out.println("Floor number :  program985.java:23  Untitled1:23    Builder.java:31  program986.java:31  Untitled2:31 - program987.java:31"+this.floorNumber);
        System.out.println("Spot number :  program985.java:24  Untitled1:24    Builder.java:32  program986.java:32  Untitled2:32 - program987.java:32"+this.spotNumber);
        System.out.println("entry time :  program985.java:25  Untitled1:25    Builder.java:33  program986.java:33  Untitled2:33 - program987.java:33"+this.entryTime);
    }
}

class Builder
{
    private int ticketNumber;
    private  String vehicleNumber;
    private  int floorNumber;
    private  int spotNumber;
    private  String entryTime;

    public Builder setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
        return this;
    }
    public Builder setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        return this;
    }
    public Builder setFloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return this;
    }
    public Builder setSpotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
        return this;
    }
    public Builder setEntryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return this;
    }

    public ParkingTicket build()
    {
        return new ParkingTicket(this);
    }

}

class program987
{
    public static void main(String A[])
    {
        ParkingTicket pobj = new Builder()
        .setTicketNumber(11)
        .setVehicleNumber("MH12VL7172")
        .setFloorNumber(4)
        .setSpotNumber(89)
        .setEntryTime("10.30 Am")
        .build();

        pobj.display();
    }

}