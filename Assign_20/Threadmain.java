class Multithread extends Thread { 
    public void run(){ 
        try { 
            System.out.println("Thread Id : "+Thread.currentThread().getId()+" is running"); 
        } 
        catch(Exception e){ 
            System.out.println("Exception is Found."); 
        } 
    } 
}

public class Threadmain{ 
    public static void main(String args[]){ 
        int n =20; 
        for(int i=0;i<n;i++){ 
             Multithread obj =new Multithread(); 
             obj.start(); 
        } 
    } 
}