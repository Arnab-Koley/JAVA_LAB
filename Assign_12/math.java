import java.lang.Math;
import java.util.Scanner;


public class math{ 
    public static void main(String[] args) { 
        Math_Operations obj = new Math_Operations();
        obj.getInput();
        obj.dispaly();
    } 
}

class Math_Operations{

    double r;

    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r = sc.nextDouble();
    }

    double calArea(){ 
        return Math.PI*Math.pow(r,2); 
    }

    double calPerimeter(){ 
        return 2*Math.PI*r; 
    }

    void dispaly(){
        System.out.println("Radius of the circle : "+r+" units"); 
        System.out.println("Area of the circle : "+ calArea()+" sq.units"); 
        System.out.println("Perimeter of the circle : "+ calPerimeter()+" units");
    }
} 
