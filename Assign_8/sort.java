import java.util.Scanner;

public class sort{ 
    public static void main(String args[]){ 

        int bs,ins;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("BUBBLE SORT\nEnter the no of element : ");
        bs=sc.nextInt();
        Bubblesort obj1=new Bubblesort(bs); 
        System.out.print("Before bubble sort : "); 
        obj1.dispaly(); 
        obj1.sorting(); 
        System.out.print("\nAfter bubble sort : "); 
        obj1.dispaly();

        System.out.print("\n\nINSERTION SORT\nEnter the no of element : ");
        ins=sc.nextInt();
        Insertionsort obj2=new Insertionsort(ins); 
        System.out.print("Before insertion sort : "); 
        obj2.dispaly(); 
        obj2.sorting(); 
        System.out.print("\nAfter insertion sort : "); 
        obj2.dispaly(); 
    } 
}

class Bubblesort{ 

    int n,arr[]; 

    Bubblesort(int b){ 
        n=b; 
        arr=new int[n]; 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter array elements : "); 
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt(); 
        } 
    } 


    void sorting(){ 
        for(int i=0;i<n-1;i++){ 
            for(int j=0;j<n-i-1;j++){ 
                if(arr[j]>arr[j+1]){ 
                    int t=arr[j]; 
                    arr[j]=arr[j+1]; 
                    arr[j+1]=t; 
                }
            } 
        } 
    } 


    void dispaly(){ 
        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" "); 
        } 
    }
} 


class Insertionsort{ 

    int n,arr[]; 

    Insertionsort(int p){ 
        n=p; 
        arr=new int [n]; 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter array elements : "); 
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt(); 
        } 
    } 

    void sorting(){ 
        for(int i=1;i<n;i++){ 
            int j=i-1,k=arr[i]; 
            while(j>=0 && (arr[j]>k)){ 
                arr[j+1]=arr[j]; 
                j=j-1; 
            } 
            arr[j+1]=k; 
        } 
    } 

    void dispaly(){ 
        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" "); 
        } 
    } 
} 



