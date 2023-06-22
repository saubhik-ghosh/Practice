public class Prog7 {
    public static void main(String[] args) {
        char c = 'A';
        if(Character.isLowerCase(c)){
            char c2 = Character.toUpperCase(c);
            System.out.print(c+" -> " + c2);
        }
        else if(Character.isUpperCase(c)){
            char c2 = Character.toLowerCase(c);
            System.out.print(c+" -> "+ c2);
        }
        else{
            System.out.print("Invalid");
        }
    }    
}
