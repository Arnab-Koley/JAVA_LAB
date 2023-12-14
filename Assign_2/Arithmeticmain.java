public class Arithmeticmain{
    public static void main(String args[]){
        Arithmetic obj = new Arithmetic(10,1.1F,'C',10.5);
        Arithmetic obj2 = new Arithmetic(20,5.1F,'B',10.5);

        System.out.println("\n\nInitial values :");
        obj.display();
        System.out.println("\n\nadd( int=10 , double=9.5 ) :");
        obj.add(10,9.5);
        obj.display();
        System.out.println("\n\nadd( int=10 , float= 2.2F ,double=10.5 ) :");
        obj.add(10,2.2F,10.5);
        obj.display();
        System.out.println("\n\nadd( float= 3.3F , int=10 , double=9.5 ) :");
        obj.add(3.3F,10,9.5);
        obj.display();
        System.out.println("\n\nadd(obj2) :");
        obj=obj.add(obj2);
        obj.display();

    }
}


class Arithmetic{
    private int a;
    private float b;
    private char c;
    private double d;

    Arithmetic(int A, float B, char C, double D){
        a=A;
        b=B;
        c=C;
        d=D;
    }

    void add(int a1, double d1){
        a+=a1;
        d+=d1;
    }

    void add(int a2, float b2, double d2){
        a+=a2;
        b+=b2;
        d+=d2;
    }

    void add(float b3, int a3, double d3){
        b+=b3;
        a+=a3;
        d+=d3;
    }

    Arithmetic add(Arithmetic obj){
        Arithmetic arm = new Arithmetic(0,0.0F,'s',0.0);
        arm.a = a+obj.a;
        arm.b = b+obj.b;
        arm.c = (char) (c + obj.c);
        arm.d = d+obj.d;
        return arm;
    }



    void display(){
        System.out.println("\nInt a = "+a);
        System.out.println("float b = "+b);
        System.out.println("Char c = "+c);
        System.out.println("Double d = "+d);
    }


}