import java.util.Scanner;

public class Areamain {
    public static void main(String Args[]){
        
        float a,b,x;

        Scanner sc = new Scanner(System.in);
        System.out.print("For Circle:\nEnter radius : ");
        x = sc.nextFloat();
        Circle c = new Circle();
        c.cal_area(x,0);

        System.out.print("\nFor Rectangle:\nEnter length : ");
        a = sc.nextFloat();
        System.out.print("Enter breadth : ");
        b = sc.nextFloat();
        Rectangle r = new Rectangle();
        r.cal_area(a,b);
    }
}

interface Area{
    final float pi = 3.14F;
    void cal_area(float a, float b);
}

class Circle implements Area {
    public void cal_area(float a, float b){
        System.out.println("Area of the circle : "+(pi*a*a));
    }
}

class Rectangle implements Area {
    public void cal_area(float a, float b){
        System.out.println("Area of the rectangle : "+(a*b));
    }
}