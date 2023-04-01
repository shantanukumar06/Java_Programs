import java.util.*;
class Sintrest{
float p,r,t,s;
  public static void main(String arg[])
{
Sintrest obj=new Sintrest();
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of p :");
obj.p=in.nextInt();
System.out.println("Enter the value of r :");
obj.r=in.nextInt();
System.out.println("Enter the value of t :");
obj.t=in.nextInt();
obj.s=((obj.p)*(obj.r)*(obj.t))/100;
    System.out.println("the value of simple interset :" +obj.s );
  }
}