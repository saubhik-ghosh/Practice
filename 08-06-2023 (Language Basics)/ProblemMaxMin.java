//Date: 08-06-2023
import java.util.*;
class MaxiMin{
    int num1;
    int num2; 
    int num3;
    void MaxMin(int a, int b, int c){
        num1 = a;
        num2 = b;
        num3 = c;
    }
    void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+" is Maximum");
        }
        else if(b>a && b>c){
            System.out.println(b+" is Maximum");
        }
        else{
            System.out.println(c+" is Maximum");
        }
    }
    void min(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(a+" is Minimum");
        }
        else if(b<a && b<c){
            System.out.println(b+" is Minimum");
        }
        else{
            System.out.println(c+" is Minimum");
        }
    }
}
public class ProblemMaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        MaxiMin obj = new MaxiMin();
        obj.MaxMin(a, b, c);
        obj.max(a, b, c);
        obj.min(a, b, c);
        sc.close();
    }
}