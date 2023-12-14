public class Computer{
    public static void main(String args[]){
        Java_professional java = new Java_professional("Max",8,"Excellent",4,"Pro");
        Python_professional py = new Python_professional("David",10,"Good",5,"Beginner");
        Network_Admin na = new Network_Admin("Harry",7,"Fair",7);
        Data_Operator d = new Data_Operator("John",9,"Good",8);
        System.out.println("\n\nComputer Professional : Developer : Java Developer");
        java.display();
        System.out.println("\n\nComputer Professional : Developer : Python Developer");
        py.display();
        System.out.println("\n\nComputer Professional : Network Admin");
        na.showdata();
        System.out.println("\n\nComputer Professional : Data Operator");
        d.showdata();
    }
}



class Computer_Professional{
    private String EName, Prospect;
    private int DutyHour;
    Computer_Professional(String n, int d, String p){
        EName=n;
        DutyHour=d;
        Prospect=p;
    }

    void show(){
        System.out.println("\nEmployee name : "+EName);
        System.out.println("Duty Hour : "+DutyHour);
        System.out.println("Prospect : "+Prospect);

    }
}

class Developer extends Computer_Professional{
    private int Sh;
    Developer(String n, int d, String p, int s){
        super(n,d,p);
        Sh=s;
    }

    void showdata(){
        show();
        System.out.println("Study Hour : "+Sh);
    }
}

class Network_Admin extends Computer_Professional{
    private int Ph;
    Network_Admin(String n, int d, String p, int s){
        super(n,d,p);
        Ph=s;
    }

    void showdata(){
        show();
        System.out.println("Practice Hour : "+Ph);
    }
}

class Data_Operator extends Computer_Professional{
    private int Ts;
    Data_Operator(String n, int d, String p, int s){
        super(n,d,p);
        Ts=s;
    }

    void showdata(){
        show();
        System.out.println("Typing Speed : "+Ts);
    }
}


class Java_professional extends Developer{
    private String Pl;
    Java_professional(String n, int d, String p, int s, String x){
        super(n,d,p,s);
        Pl=x;
    }

    void display(){
        showdata();
        System.out.println("Proficiency Level : "+Pl);
    }
}

class Python_professional extends Developer{
    private String Pl;
    Python_professional(String n, int d, String p, int s, String x){
        super(n,d,p,s);
        Pl=x;
    }

    void display(){
        showdata();
        System.out.println("Proficiency Level : "+Pl);
    }
}