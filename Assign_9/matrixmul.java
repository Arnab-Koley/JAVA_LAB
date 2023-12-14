import java.util.Scanner;

public class matrixmul{
    public static void main(String args[]){
        int r1, r2, c1, c2;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows of Matrix A: ");
        r1=sc.nextInt();
        System.out.print("Enter the number of columns of Matrix A: ");
        c1=sc.nextInt();
        System.out.print("Enter the number of rows of Matrix B: ");
        r2=sc.nextInt();
        System.out.print("Enter the number of columns of Matrix B: ");
        c2=sc.nextInt();

        if(c1 != r2){
            System.out.println("No of columns in Matrix A != No of rows in Matrix B: Matrix Multiplication Not Possible");
        }
        else{
            
            Matrix matA=new Matrix(r1, c1);
            System.out.println("Enter the elements of Matrix A:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    int val=sc.nextInt();
                    matA.setElement(i,j,val);
                }
            }

            Matrix matB=new Matrix(r2, c2);
            System.out.println("Enter the elements of Matrix B:");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    int val=sc.nextInt();
                    matB.setElement(i,j,val);
                }
            }

            Matrix result=Matrix.multiply(matA,matB);

            System.out.println("Result of matrix multiplication:");
            for(int i=0;i<result.getRows();i++){
                for(int j=0;j<result.getCols();j++){
                    System.out.print(result.getElement(i,j)+" ");
                }
                System.out.println();
            }
        }
    }
}


class Matrix{
    private int r,c;
    private int[][] data;

    public Matrix(int rows, int cols){
        this.r=rows;
        this.c=cols;
        this.data=new int[rows][cols];
    }

    void setElement(int row, int col, int val){
        data[row][col]=val;
    }

    int getRows(){
        return r;
    }

    int getCols(){
        return c;
    }

    int getElement(int row, int col){
        return data[row][col];
    }

    static Matrix multiply(Matrix mat1, Matrix mat2){
        int r1=mat1.getRows();
        int c1=mat1.getCols();
        int c2=mat2.getCols();

        Matrix resultMatrix = new Matrix(r1,c2);

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    resultMatrix.setElement(i , j , resultMatrix.getElement(i,j)+mat1.getElement(i,k)*mat2.getElement(k,j));
                }
            }
        }
        return resultMatrix;
    }
}
