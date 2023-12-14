import java.util.Scanner;

public  class Discountmain {
    public static void main(String args[]){
        double a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sales ammount : ");
        a = sc.nextDouble();

        Discount D1 = new Discount(a);
        D1.compute1();
        System.out.print("\nBy Compute-1 (if-else)\n");
        D1.display();
        
        D1.compute2();
        System.out.print("\nBy Compute-2 (ternary)\n");
        D1.display();
    }
}

class Discount {
    private double s,dis;

    Discount(double a){
        s = a;
    }

    void compute1(){
        if(s > 40000){
            dis = s*0.1;
        }
        else if(s > 20000){
            dis = s*0.05;
        }
        else if(s > 10000){
            dis = s*0.03;
        }
        else{
            dis = 0;
        }
    }

    void compute2(){
        dis = (s > 40000) ? s*0.1 : (s > 20000) ? s/20 : (s > 10000) ? s*0.03 : 0;
    }

    void display(){
        if(dis != 0){
            System.out.println("Sales ammount : "+s+" Rs.");
            System.out.println("Your Discount ammount : "+dis+" Rs.");
        }
        else{
            System.out.println("No discount will be given");
        }
    }
}





