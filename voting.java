import java.util.Scanner;
class voting

{int age;
public static void main(String[] xy){
Scanner obj=new Scanner(System.in);
voting v=new voting();
System.out.println("enter your age:" );
v.age=obj.nextInt();
System.out.println((v.age<18)?"you are not eligible for voting":"you are eligible for voting");
  }
}