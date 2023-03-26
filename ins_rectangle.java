class ins_rectangle  
 {  
   double l=21,b=18,area; //instance variable
   public static void main (String[] x)  
    {   
        ins_rectangle s=new ins_rectangle();
        s.area=s.l*s.b;     
        System.out.println("Area of Rectangle is : "+s.area);  
    }
}  