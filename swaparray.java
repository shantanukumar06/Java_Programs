import java.util.Scanner;
class swaparray {
  int n ;
public static void main(String[] xy){
int i;

swaparray obj=new swaparray();
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements in array a and b :");
obj.n=in.nextInt();
int[] a=new int [obj.n];
int[] b=new int [obj.n];
int[] temp=new int [obj.n];
System.out.println("Enter the values of array a :");
for(i=0;i<obj.n;i++){
  a[i]=in.nextInt();  
}
System.out.println("Enter the values of array b :");
for(i=0;i<obj.n;i++){
  b[i]=in.nextInt();  
}

for(i=0;i<obj.n;i++){
  temp[i]=a[i];  
}
for(i=0;i<obj.n;i++){
  a[i]=b[i];  
}
for(i=0;i<obj.n;i++){
  b[i]=temp[i];  
}
System.out.println("\nThe value of a is :");
for(i=0;i<obj.n;i++){
  System.out.println(" "+a[i]);
}
System.out.println("\nThe value of b is :");
for(i=0;i<obj.n;i++){
  System.out.println(" "+b[i]);
}
}
}