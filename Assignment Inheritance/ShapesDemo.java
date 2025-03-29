public class ShapesDemo {
    public static void main(String[] args){
        Rectangle r = new Rectangle(3,5);
        r.area();
        Circle c = new Circle(8);
        c.area();
    }
}
class Shape{
    int length;
    int breadth;
    Shape(int length){
        this.length=length;
    }
    Shape(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void area(){
        System.out.println("Area is defined only for specific shape");
    }
}
class Circle extends Shape{
    Circle(int length){ super(length);}
    @Override void area(){
        System.out.println("Area of Circle: "+(3.14*length*length));
    }
}
class Rectangle extends Shape{
    Rectangle(int length,int breadth){ super(length,breadth);}
    @Override void area(){
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
