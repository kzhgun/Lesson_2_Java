// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

import java.util.Scanner;

public class Fourth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы:");
        int n = sc.nextInt();
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

}
