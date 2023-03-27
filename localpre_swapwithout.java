class localpre_swapwithout{
  public static void main(String[] as){
    int a=8,b=15;
    System.out.println("Before swaping : a = "+a+" and b = "+b);
    //swaping perform
    a=a+b;   
    b=a-b;
    a=a-b;
    System.out.println("After swaping : a = "+a+" and b = "+b);
  }
}