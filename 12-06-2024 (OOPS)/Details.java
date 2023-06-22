import java.util.Scanner;

public class Details {
    void idCard(String name, String course, String branch, String roll_no){
        //System.out.println(name+" "+course+" "+branch+" "+roll_no);
        System.out.println("*********Student ID Card*********");
        System.out.println("Student Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Branch: "+branch);
        System.out.println("Roll Number: "+roll_no);  
        System.out.println("***********************************");  
    }
    void personalDetail(String name, String FatherName, String MotherName, int BirthDay, String blood){
        //System.out.println(FatherName+" "+MotherName+" "+BirthDay+" "+blood);
        System.out.println("********Personal Details********");
        System.out.println("Name: "+ name);
        System.out.println("Father's Name: "+FatherName);
        System.out.println("Mother's Name: "+MotherName);
        System.out.println("Birthday: "+BirthDay);
        System.out.println("Blood Group: "+blood);
        System.out.println("***********************************");
    }
    void marks(float sem1, float sem2, float sem3, float sem4, float sem5, float sem6, float sem7, float sem8){
        System.out.println("******Marks Details******");
        System.out.println("Semester 1: "+sem1+" "+"Semester 2: "+sem2);
        System.out.println("Semester 3: "+sem3+" "+"Semester 4: "+sem4);
        System.out.println("Semester 5: "+sem5+" "+"Semester 6: "+sem6);
        System.out.println("Semester 7: "+sem7+" "+"Semester 8: "+sem8);
        System.out.println("***********************************");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Details obj = new Details();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll_no = sc.nextLine();
        System.out.print("Enter Father name: ");
        String FatherName = sc.nextLine();
        System.out.print("Enter Mother name: ");
        String MotherName = sc.nextLine();
        System.out.print("Enter Birthday: ");
        int Birthday = sc.nextInt();
        System.out.print("Enter Blood Group: ");
        String blood = sc.next();
        System.out.print("Enter Semester 1 Marks: ");
        float sem1 = sc.nextFloat();
        System.out.print("Enter Semester 2 Marks: ");
        float sem2 =sc.nextFloat();
        System.out.print("Enter Semester 3 Marks: ");
        float sem3 =sc.nextFloat();
        System.out.print("Enter Semester 4 Marks: ");
        float sem4 =sc.nextFloat();
        System.out.print("Enter Semester 5 Marks: ");
        float sem5 =sc.nextFloat();
        System.out.print("Enter Semester 6 Marks: ");
        float sem6 =sc.nextFloat();
        System.out.print("Enter Semester 7 Marks: ");
        float sem7 =sc.nextFloat();
        System.out.print("Enter Semester 8 Marks: ");
        float sem8 =sc.nextFloat();
        obj.idCard(name, course, branch, roll_no);
        obj.personalDetail(name,FatherName, MotherName, Birthday, blood);
        obj.marks(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
        sc.close();
    }
}
