import java.util.Scanner;

class Even_odd{
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
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int a = sc.nextInt();
        Even_odd obj = new Even_odd();
        obj.EvenandOdd(a);
        obj.even(a);
        sc.close();
    }
}
