package com.Faraz;

import java.util.Scanner;

public class TwoDimensionalArrayAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter values: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }

    }

}
