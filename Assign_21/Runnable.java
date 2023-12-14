class Mthread implements Runnable{ 
    private Thread t; 
    private String threadname; 
     
    Mthread(String name){ 
        threadname = name; 
        System.out.println("Creating "+threadname); 
    }

    public void run(){ 
        System.out.println("Running "+threadname); 
        try{ 
            for(int i=2; i>0; i--){ 
                System.out.println("Thread: "+threadname+" , Part-" +i); 
                Thread.sleep(50); 
            } 
        } 
        catch(InterruptedException e){ 
            System.out.println("Thread "+threadname+" interrupted"); 
        } 
        System.out.println("Thread "+threadname+" exiting"); 
    } 
 
    public void start(){ 
        System.out.println("Starting "+threadname); 
        if(t == null){ 
            t = new Thread(this, threadname); 
            t.start(); 
        } 
    }
 
} 

public class Runnable { 
    public static void main(String[] args) { 
        Mthread t[] = new Mthread[10]; 
        for(Integer i=0; i<10; i++){ 
            t[i] = new Mthread("Thread-"+i); 
            t[i].start(); 
        } 
    } 
}