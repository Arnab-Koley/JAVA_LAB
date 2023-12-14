class Employee{
    private String ECode, Ename, Contact, Dept;
    private double BasicSal, GrossSal, DA, HRA, MA, BP, B=0 ;//BP=bonud percentage
    Employee(String c, String n, String cn, String d, double bs, double bp){
        ECode=c;
        Ename=n;
        Contact=cn;
        Dept=d;
        BasicSal=bs;
        BP=bp;
    }
        
    void TotSalary(){
        DA = 0.75*BasicSal;
        HRA = 0.15*BasicSal;
        MA = 0.1*BasicSal;
        GrossSal = BasicSal+DA+HRA+MA;
    }

    void calcBonus(){
        B = GrossSal*(BP/100);
    }

    void showdata(){
        System.out.println("\nEmployee Code : "+ECode);
        System.out.println("Employee Name : "+Ename);
        System.out.println("Contact no : "+Contact);
        System.out.println("Department : "+Dept);
        System.out.println("Basic salary : "+BasicSal);
        System.out.println("Gross salary : "+GrossSal);
        System.out.println("Bonus : "+BP+"%");
        System.out.println("Total Bonus : "+B);
        System.out.println("Total Salary: "+(GrossSal+B));
    }
}


class Manager extends Employee{
    Manager(String c, String n, String cn, String d, double bs){
        super(c,n,cn,d,bs,0);
    }
    void show(){
        TotSalary();
        showdata();
    }
}

class Engineer extends Employee{
    Engineer(String c, String n, String cn, String d, double bs){
        super(c,n,cn,d,bs,5);
    }
    void show(){
        TotSalary();
        calcBonus();
        showdata();
    }
}

class Clerk extends Employee{
    Clerk(String c, String n, String cn, String d, double bs){
        super(c,n,cn,d,bs,10);
    }
    void show(){
        TotSalary();
        calcBonus();
        showdata();
    }
}

public class Employee_info{
    public static void main(String args[]){
        Manager man = new Manager("MAN01X","David", "+91-1122334455", "Manager", 30000);
        Engineer eng = new Engineer("ENG05X","Mark", "+91-5566778899", "Engineer", 20000);
        Clerk clk = new Clerk("CLK03X","John", "+91-1122884499", "Clerk", 10000);
        man.show();
        eng.show();
        clk.show();
    }
}