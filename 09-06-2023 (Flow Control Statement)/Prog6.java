import java.util.Scanner;

public class Prog6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Gender: ");
        String gen = sc.nextLine();
        if(gen.equals("Female")){
            System.out.print("Enter the Age: ");
            int age = sc.nextInt();
            if(age>=1 && age<=58){
                System.out.println("The percentage of intereset is 8.2%");
            }
            else if(age>=59 && age<=100){
                System.out.println("The percentage of intereset is 9.2%");
            }
        }
        else if(gen.equals("Male")){
            System.out.print("Enter the Age: ");
            int age = sc.nextInt();
            if(age>=1 && age<=58){
                System.out.println("The percentage of intereset is 8.4%");
            }
            else if(age>=59 && age<=100){
                System.out.println("The percentage of intereset is 10.5%");
            }
        }
        sc.close();
    }
}