import java.util.Scanner;

class Employee{

    private String id, name, address, contact;

    Employee(String i, String n, String a, String c){
        id=i;
        name=n;
        address=a;
        contact=c;
    }

    void display(){
        System.out.println("\nEmployee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee address : "+address);
        System.out.println("Employee contact number : "+contact);
    }
}


public class employee_info{
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee id:");
        String id=sc.nextLine();

        System.out.println("Enter employee name:");
        String n=sc.nextLine();

        System.out.println("Enter employee address:");
        String a=sc.nextLine();

        System.out.println("Enter employee contact number:");
        String cn=sc.nextLine();

        Employee obj = new Employee(id,n,a,cn);
        obj.display();
    }
}
