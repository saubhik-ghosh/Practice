import java.util.Scanner;;
public class Prog1_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        if(num1<0){
            System.out.println("Negative");
        }
        else if(num1>0){
            System.out.println("Positive");
        }
        else if(num1 == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Not a Proper Number");
        } 
        sc.close();
    }
}
