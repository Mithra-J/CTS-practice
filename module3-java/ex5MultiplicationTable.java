import java.util.*;
public class ex5MultiplicationTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table: ");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
}
