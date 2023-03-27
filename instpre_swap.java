import java.util.Scanner;
class instpre_swap
{
int a=54;
int b=78;
public static void main(String[] xy){
instpre_swap obj=new instpre_swap();
int temp=obj.a;
obj.a=obj.b;
obj.b=temp;
System.out.println("the value of a is :"+obj.a + "and the value of b is :"+obj.b);
  }
}