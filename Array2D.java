import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
//        type[][] name=new type[row size][columns size]
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the row");
        int row=input.nextInt();
        System.out.println("Please enter the coloumns");
        int coloums=input.nextInt();
        int[][] newArray2d=new int[row][coloums];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloums; j++) {
                newArray2d[i][j]=input.nextInt();
            }

        }
        System.out.println("------------------------------------------------------------------");
        //    PRINTING THE VALUES OF 2D ARRYAY
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloums; j++) {
                System.out.print(newArray2d[i][j]+" ");
            }
            System.out.println();
    }

    }

}
