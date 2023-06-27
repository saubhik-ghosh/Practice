class Father{
    String name = "Koushik Ghosh";
    int age = 50;
    double salary = 100000.00;
    String car = "Skoda Fabia";

    public void drinking(){
        System.out.println("Father is drinking juice");
    }
}
class Child extends Father{
    String name = "Saubhik Ghosh";
    int age = 21;
    double salary = 0;
    String bike = "Yamaha Fascino";

    public void eating(){
        System.out.println("Child is eating Chocolate");
    }
}
public class Male{
    public static void main(String[] args) {
        Father a = new Father();
        Child b = new Child();
        System.out.println(a.name);
        System.out.println(b.name);
        a.drinking();
        b.eating();
    }
}