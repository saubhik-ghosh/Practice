import java.util.Scanner;
public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting number: ");
        int s =  sc.nextInt();
        System.out.print("Enter the stopping number: ");
        int e = sc.nextInt();
        for(int i=s; i<=e; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();   
    }
}
