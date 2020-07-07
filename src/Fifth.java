//5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);


import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {
        int[] array = {13, 2, 4, 5, 6, 0, 1, 15, -4, 2};
        int max = array [0];
        int min = array [0];
        for (int i = 0; i < array.length-1; i++){
            if (array[i+1] >= max){
                max = array[i+1];
            }
            else if (array[i+1] < min) {
                min = array[i+1];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }

}
