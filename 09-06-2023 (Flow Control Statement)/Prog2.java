import java.util.Scanner;

class EvenOdd{
    int num;
    void EvenandOdd(int a){
        num = a;
    }
    void even(int a){
        if (a%2==0){
            System.out.println(a+ " is Even");
        }
        else{
            System.out.println(a+ " is Odd");
        }
    }
}
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int a = sc.nextInt();
        EvenOdd obj = new EvenOdd();
        obj.EvenandOdd(a);
        obj.even(a);
        sc.close();
    }
}