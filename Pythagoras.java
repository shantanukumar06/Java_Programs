import java.util.*;
import java.lang.*;
class Pythagoras{
int p,b;
double h;
  public static void main(String arg[])
{
Pythagoras obj=new Pythagoras();
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of p :");
obj.p=in.nextInt();
System.out.println("Enter the value of b :");
obj.b=in.nextInt();
obj.h=Math.sqrt((obj.p*obj.p)+(obj.b*obj.b));
    System.out.println("hypo is  :" +obj.h );
  }
}