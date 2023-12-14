public class Timemain {
    public static void main(String[] args) {
        Time obj = new Time(10, 50, 50.5);
        Time obj1 = new Time(1, 5, 120.5);
        System.out.println("\nInitial Time :");
        obj.showtime();
        System.out.println("\nAdding Min=12 :");
        obj.add_time(12);
        obj.showtime();
        System.out.println("\nAdding Hour=2 , Min=58 :");
        obj.add_time(2, 58);
        obj.showtime();
        System.out.println("\nAdding Sec=40.5 :");
        obj.add_time(40.5);
        obj.showtime();
        System.out.println("\nAdding with object :");
        obj=obj.add_time(obj1);
        obj.showtime();
    }
}


class Time {
    private int hr;
    private int min;
    private double sec;

    Time(int a, int b, double c) {
        hr = a;
        min = b;
        sec = c;
    }

    void add_time(int m) {
        min += m;
        if(min>59){
            min = min % 60;
            hr = hr + 1;
        }
    }

    void add_time(int h, int m) {
        min += m;
        if(min>59){
            min = min % 60;
            hr = hr + 1;
        }
        hr += h;
    }

    void add_time(double s) {
        sec += s;
        if(sec>59){
            sec = sec - 60;
            min = min + 1;
        }
        if (min>59){
            min = min % 60;
            hr = hr + 1;
        }
    }

    Time add_time(Time t2) {
        Time t3 = new Time(0, 0, 0.0);
        t3.sec = sec + t2.sec;
        t3.min = min + t2.min;
        t3.hr = hr + t2.hr;
        if(t3.sec > 59){
            t3.min += 1;
            t3.sec %= 60;
        }
        if(t3.min > 59){
            t3.hr ++;
            t3.min %= 60;
        }
        return t3;
    }

    void showtime() {
        System.out.println("Time is = "+hr+" : "+min+" : "+sec);
    }
}


