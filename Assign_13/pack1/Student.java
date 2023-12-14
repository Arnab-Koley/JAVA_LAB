package pack1;

public class Student {
    public String Name;
    public int Roll;

    public void get_data(String n, int r){
        Name = n;
        Roll = r;
    }

    public void put_data(){
        System.out.println("Name : "+Name);
        System.out.println("Roll No. : "+Roll);
    }
}