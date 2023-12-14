public class rational{
    public static void main(String args[]){
        Num obj = new Num(1,2,3,4);
        obj.calc();
        obj.display();
    }
}

class Num {
    private int x1,x2,x3,x4,x5,x6,y1,y2,y3,y4;
    Num(int a, int b, int c, int d){
        x1=a;
        y1=b;
        x2=c;
        y2=d;
    }
    void calc(){
        x3=(x1*y2)+(x2*y1);
        x4=(x1*y2)-(x2*y1);
        x5=x1*x2;
        x6=x1*y2;
        y3=y1*y2;
        y4=x2*y1;
    }

    void display(){
        System.out.println("("+x1+","+y1+") + ("+x2+","+y2+") = ("+x3+","+y3+")");
        System.out.println("("+x1+","+y1+") - ("+x2+","+y2+") = ("+x4+","+y3+")");
        System.out.println("("+x1+","+y1+") * ("+x2+","+y2+") = ("+x5+","+y3+")");
        System.out.println("("+x1+","+y1+") / ("+x2+","+y2+") = ("+x6+","+y4+")");
    }  
}


