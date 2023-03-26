import java.util.Scanner;
class local_swapwithoutthirdvariable
{
public static void main(String[] xy){
int a;
int b;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of a :");
a=in.nextInt();
System.out.println("Enter the value of b :");
b=in.nextInt();
b=a+b;
a=b-a;
b=b-a;
System.out.println("the value of a is :"+a + "the value of b is :"+b);
  }
}