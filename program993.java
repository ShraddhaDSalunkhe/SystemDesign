//builder type of pattern 
class Demo
{
    public int i, j;
    public Demo setI(int no)
    {
      this.i =no;
      return this;
    }
    public Demo setJ(int no)
    {
      this.j =no;
      return this;
    }
    public void display()
    {
        System.out.println("i : - program993.java:17"+i);
         System.out.println("j : - program993.java:18"+j);
    }
}
class program993
{
    public static void main (String A[])
    {
      new Demo()
      .setI(11)
      .setJ(21)
      .display();
    }
}