import java.util.Scanner;
class swapinspre{
  int a=48,b=12;  //instance variable
  public static void main(String[] as){
    swapinspre obj=new swapinspre();
    System.out.println("Before swaping : a = "+obj.a+" and b = "+obj.b);
    //swaping perform
    obj.a=obj.a+obj.b;   
    obj.b=obj.a-obj.b;
    obj.a=obj.a-obj.b;
    System.out.println("After swaping : a = "+obj.a+" and b = "+obj.b);
  }
}