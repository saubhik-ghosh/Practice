class Rectangle{
    double length = 10;
    double breadth = 30;
    double calculateArea(){
        return length*breadth;
    }
}
//Using default constructors
class Rectangle_main{
    public static void main(String[] args) {
        double area;
        Rectangle Myrec = new Rectangle();
        area = Myrec.calculateArea();
        System.out.println("The area of the rectangle: "+area);
    }
}