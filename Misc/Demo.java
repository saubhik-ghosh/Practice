import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
        scan.close();
    }
}