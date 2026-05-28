import java.util.*;
public class ex2Calc {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double a=sc.nextInt();
        System.out.println("Enter number 2: ");
        double b=sc.nextInt();
        System.out.println("Enter the symbol(+,-,*,/): ");
        char sym=sc.next().charAt(0);
        if(sym=='+'){
            System.out.println(a+b);
        }else if(sym=='-'){
            System.out.println(a-b);
        }else if(sym=='*'){
            System.out.println(a*b);
        }else if(sym=='/'){
            System.out.println(a/b);
        }else{
            System.out.println("Invalid operation. Enter a valid operator(+,-,*,/)....");
        }
        sc.close();
    }
}
