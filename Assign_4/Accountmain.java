public class Accountmain {
    public static void main(String args[]){

        Savings_Ac obj1 = new Savings_Ac("110245908", "David", "+91-1122334455", 3, 10000);
        Current_Ac obj2 = new Current_Ac("220245919", "Alex", "+91-9988776655", 2000, 1000);
        TD_Ac obj3 = new TD_Ac("330245897", "carolina", "+91-1199228855", 5, 3,5000);
        
        obj1.compute();
        System.out.println("\n===== Savings Account =====\n");
        obj1.showdata();
        obj2.compute();
        System.out.println("\n===== Current Account =====\n");
        obj2.showdata();
        obj3.compute();
        System.out.println("\n===== TD Account =====\n");
        obj3.showdata();
    }
}

class Account{
    
    private String Acc_no,C_Name,Contact_No;

    Account(String acc, String name, String num){
        Acc_no = acc;
        C_Name = name;
        Contact_No = num;
    }

    void show(){
        System.out.println("Account No : "+Acc_no);
        System.out.println("Customer Name : "+C_Name);
        System.out.println("Contact No : "+Contact_No);
    }
}

class Savings_Ac extends Account{

    private float b, r, res, i;
    private int t=1;

    Savings_Ac(String ac, String n, String c, float roi, float balance){
        super(ac,n,c);
        b=balance;
        r=roi;
    }

    void compute(){
        i = (b*r*t)/100;
        res = b+i;
    }

    void showdata(){
        super.show();
        System.out.println("Principal amount : "+b);
        System.out.println("Rate of Interest : "+r+"%");
        System.out.println("Time period : "+t+" year");
        System.out.println("Total interest : "+i);
        System.out.println("New savings account balance : "+res);
    }

}


class Current_Ac extends Account{

    private float b, min, res, penalty_rate=5, penalty=0;
    private int t=1;

    Current_Ac(String ac, String n, String c, float mb, float balance){

        super(ac, n, c);
        b=balance;
        min=mb;
    }

    void compute(){
       if(b < min){
            penalty = (b*penalty_rate*t)/100;
            res = b - penalty;
       }
       else{
            res = b;
       }
    }

    void showdata(){
        super.show();
        System.out.println("Principal amount : "+b);
        System.out.println("Minumum amount : "+min);
        System.out.println("Penalty rate : "+penalty_rate+"%");
        if(b != res){
            System.out.println("Principal ammount < minimum ammount : penalty = "+penalty);
        }
        else{
            System.out.println("Principal ammount >= minimum ammount : penalty = "+penalty);
        }
        System.out.println("New current account balance : "+res);
    }

}

class TD_Ac extends Account{

    private float b, r, tr, m;
    private double res;
    private int t=5;

    TD_Ac(String ac, String n, String c, float roi, float term, float balance){

        super(ac, n, c);
        b=balance;
        r=roi;
        tr=term;
    }

    void compute(){
        m = (12*t)/tr;
        res = b*Math.pow((1+r/(m*100)),m*tr);
    }

    void showdata(){
        super.show();
        System.out.println("Principal amount : "+b);
        System.out.println("Rate of Interest : "+r+"%");
        System.out.println("Time period : "+t+" year");
        System.out.println("Term : "+tr);
        System.out.println("No of Installment : "+m);
        System.out.println("Maturity Balance : " + String.format("%.3f", res));
    }

}







