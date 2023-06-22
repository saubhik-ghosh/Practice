public class Test {
    String name;
    Test(String n)
    {
        this.name = n;
    }
    public static void main(String[] args) {
        Test stu1 = new Test("Nova");
        Test stu2 = new Test("Aku");
        System.out.println(stu1.name);
        System.out.println(stu2.name);
    }
}
