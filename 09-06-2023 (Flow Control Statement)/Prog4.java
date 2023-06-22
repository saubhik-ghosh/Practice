//import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a character: ");
        //char c1 = sc.next().charAt(0);
        //System.out.print("Enter the 2nd character: ");
        //char c2 = sc.next().charAt(0);
        char c1 = 's';
        char c2 = 'a';
        if(c1 > c2){
            char temp = c1;
            c1 = c2;
            c2 = temp;
        }
        System.out.println("The two characters in alphabetical order are: "+ c1 +","+ c2);
        //sc.close();
    }
}
