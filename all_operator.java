import java.util.*;
class test {
    private static int a;

    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter operands");
        a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter 1 for urinary operator\n enter 2 for binary operator\n enter 3 for ternary operator\n");
        int c =sc.nextInt();
        switch(c){
            case 1:
                System.out.println("enter 1 for increment\n enter 2 for decrement");
                int type=sc.nextInt();
                if (type==1){
                    System.out.println("enter 1 for pre increment\n enter 2 for post increment");
                    int d=sc.nextInt();
                    if(d==1){
                        ++a;
                        ++b;
                    }
                    else{
                        a++;
                        b++;
                    }
                }else{System.out.println("enter 1 for pre decrement\n enter 2 for post decrement");
                    int d=sc.nextInt();
                    if(d==1){
                        ++a;
                        ++b;
                    }
                    else{
                        a++;
                        b++;
                    }
                }
                System.out.println("value of a ="+a +"\nvalue of b ="+b );
                break;
            case 2:
                System.out.println("enter 1 for aritmetic  operator\n enter 2 for relational operator\n enter 3 for assignment operator\n");
                int op = sc.nextInt();
                if(op==1){
                    int t =sc.nextInt();
                    float f;
                    switch(t){
                        //float f;
                        case 1 :System.out.println("the sum of two number is =");
                            f =a+b;
                            System.out.println(f);
                            break;
                        case 2:System.out.println("the sub of two number is =");
                            f =a-b;
                            System.out.println(f);
                            break;
                        case 3:System.out.println("the mul of two number is =");
                            f =a*b;
                            System.out.println(f);
                            break;
                        case 4:System.out.println("the div of two number is =");
                            f =a/b;
                            System.out.println(f);
                            break;
                        default:
                            System.out.println("the invalid operator");
                    }
                    if(op==2){
                        int g =sc.nextInt();
                        switch(g) {
                            case 1:System.out.println("the equal operator =");
                                if (a==b){
                                    System.out.println("a is equal to b");
                                    break;}
                                // case 2:System.out.println("the non equal operator =");
                                //  if(a=!b){
                                // System.out.println("a is not equal to b");
                                //  break;}
                            case 3:System.out.println("the less than operator =");
                                if(a<b){
                                    System.out.println("a is less than b");
                                    break;}
                            case 4:System.out.println("the greater than operator  =");
                                if(a>b){
                                    System.out.println("a is greater than b");
                                    break;}

                        }
                    }
                    else{
                        int x =sc.nextInt();
                        if(x==1){
                            f=a;
                        }else{
                            f=b;
                        }

                    }
                    break;
                }

            case 3:
                int z = a>b?a:b;
                if(a>b){
                    System.out.println("a is greater than b");
                }else{
                    System.out.println("a is smaller than b");

                }
        }

    }
}

