import java.util.*;
class ex4LeapYear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year: ");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is an leap year");
                }else{
                    System.out.println(year+" is not an leap year");
                }
            }else{
                System.out.println(year+" is an leap year");
            }
        }else{
            System.out.println(year+" is not an leap year");
        }
        sc.close();
    }
}