public class Student_Details{
    void display(String name, String Roll, int age, float cgpa){
        System.out.println(name);    
        System.out.println(Roll);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(name+" "+Roll+" "+age+" "+cgpa);
    }
    public static void main(String[] args) {
        Student_Details obj = new Student_Details();
        obj.display("Saubhik", "208R1A66A", 21, 7.89f);
    }
}