import java.util.Arrays;
import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size of the 2D Array:");
        int rowsize=scanner.nextInt();
        System.out.println("Enter the column size of the 2D Array:");
        int colsize=scanner.nextInt();
        int array[][]=new int[rowsize][colsize];
        System.out.println("Enter the Array Elements row wise:");
        for (int i = 0; i < rowsize; i++) {
            for(int j=0;j<colsize;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        columnsum(array,rowsize,colsize);

    }

    private static void columnsum(int[][] array, int rowsize,int colsize) {
        int count[]=new int[colsize];
        int index=0;
        for (int i = 0; i < colsize; i++) {
            for(int j=0;j<rowsize;j++){
                count[index]+=array[j][i];

            }
            index++;
        }
        System.out.println(Arrays.toString(count));
    }
}
