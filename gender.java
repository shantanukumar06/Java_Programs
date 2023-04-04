import java.util.Scanner;
class gender

{char gen;
public static void main(String[] xy){
Scanner obj=new Scanner(System.in);
gender g=new gender();
System.out.println("enter your input:");
g.gen=obj.next().charAt(0);
switch(g.gen){
case 'm':System.out.println("you are a male");
break;
case 'f':System.out.println("you are a female");
break;
case 't':System.out.println("you are a transgender");
break;
default:System.out.println("you are not a human");

}
  }
}