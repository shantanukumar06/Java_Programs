
import java.util.*;
class two_numberstables{
public static void main(String[] args){
Scanner t= new Scanner(System.in);
System.out.println("Enter the value of n :");
int n = t.nextInt();
System.out.println("Enter the value of m :");  
int m = t.nextInt();  
for(int i=1,j=10;i<=10&&j>=1;i++,j--){
System.out.println(n*i+"\t"+m*j);
 }   
}
}