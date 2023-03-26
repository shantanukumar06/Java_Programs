import java.util.Scanner;
class inst_swapwithoutthirdvariable
{
int a;
int b;
public static void main(String[] xy){
inst_swap obj=new inst_swap();
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of a :");
obj.a=in.nextInt();
System.out.println("Enter the value of b :");
obj.b=in.nextInt();
obj.b=obj.a+obj.b;
obj.a=obj.b-obj.a;
obj.b=obj.a-obj.b;
System.out.println("the value of a is :"+obj.a + "the value of b is :"+obj.b);
  }
}