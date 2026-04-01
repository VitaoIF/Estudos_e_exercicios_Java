package questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] mat = new int[n][n]; // N linhas e N colunas

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Números negativos: " + count);

        input.close();
    }
}
