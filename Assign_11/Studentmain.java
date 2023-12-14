import java.util.Scanner;

public class Studentmain {
    public static void main(String Args[]){
        Sem_Result s1 = new Sem_Result();
        Sem_Result s2 = new Sem_Result();
        System.out.println("[ For 1st student ]");
        s1.get_data();
        System.out.println("\n[ For 2nd student ]");
        s2.get_data();
        System.out.println("\nStudent-1 :");
        s1.put_data();
        System.out.println("\nStudent-2 :");
        s2.put_data();
    }
}


class Student {

    public String Name;
    public int Roll;

    void get_data(String n, int r){
        Name = n;
        Roll = r;
    }

    void put_data(){
        System.out.println("Name : "+Name);
        System.out.println("Roll No. : "+Roll);
    }
}


class Test_marks extends Student {

    public double Marks1, Marks2;

    void get_data(String name, int roll){
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter first marks : ");
        Marks1 = sc2.nextDouble();
        System.out.print("Enter second marks : ");
        Marks2 = sc2.nextDouble();
        super.get_data(name,roll);
    }

    void put_data(){
        super.put_data();
        System.out.println("1st marks : "+Marks1);
        System.out.println("2nd marks : "+Marks2);
    }
}


interface CCA_Score {
    float CCA_credit=5;
    void show_cca_cred();
}


class Sem_Result extends Test_marks implements CCA_Score {

    public String name;
    public int roll;

    void get_data(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter student name : ");
        name = sc1.nextLine();
        System.out.print("Enter student roll : ");
        roll = sc1.nextInt();
        super.get_data(name,roll);
    }

    public void show_cca_cred(){
        System.out.println("Credit of the student is : "+CCA_credit);
    }

    void put_data(){
        super.put_data();
        show_cca_cred();
    }
}




