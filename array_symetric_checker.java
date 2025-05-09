import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 3;

        int n2 = 3;
        int[][] a = new int[n1][n2];


        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.println("ENTER THE ELEMENTS OF ARRAY FOR " + (i) + "," + (j));
                a[i][j] = sc.nextInt();
            }

        }


        System.out.println("ARRAY BEFORE THE TRANSPOSE:: ");

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        if (n1 == n2) {
            System.out.println("ARRAY AFTER THE TRANSPOSE:: ");

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(a[j][i] + "\t");
                }
                System.out.println();
            }
            int count = 0;
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    if (a[i][j] == a[j][i]) {
                        count++;
                    }
                }
                System.out.println();
            }
            if (count == 9) {
                System.out.println("IT IS A SYMETRIC MATRIX");
            } else {
                System.out.println("IT IS   ASYMETRIC MATRIX");
            }
        }
        else{
            System.out.println("NOT TRANSPOSABLE");
        }
    }

}
