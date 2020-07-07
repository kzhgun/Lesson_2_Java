//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;


import java.util.Arrays;

public class Second {
    public static void main(String args[]) {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1] = arr[i] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
