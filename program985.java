
class ParkingTicket
{
    private int ticketNumber;
    private String vehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;

    public ParkingTicket(int a, String b, int c, int d, String e)
    {
        this.ticketNumber = a;
        this.vehicleNumber = b;
        this.floorNumber = c;
        this.spotNumber = d;
        this.entryTime = e;

    }
    public void display()
    {
        System.out.println("Ticket number : - program985.java:21"+this.ticketNumber);
        System.out.println("vehicle number : - program985.java:22"+this.vehicleNumber);
        System.out.println("Floor number : - program985.java:23"+this.floorNumber);
        System.out.println("Spot number : - program985.java:24"+this.spotNumber);
        System.out.println("entry time : - program985.java:25"+this.entryTime);
    }
}


class program985
{
    public static void main(String A[])
    {
        ParkingTicket p1 = new ParkingTicket(11,"MH12 VL7172",3,89,"9:30 AM");
        ParkingTicket p2 = new ParkingTicket(12,"MH14 VL7020",4,32,"9:50 AM");
    
        p1.display();
        p2.display();
         
    }

}