import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Задание 1
        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */

        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0};
        System.out.println(Arrays.toString(arr));
        for (int i=0; i < arr.length; i++){
            if ( arr[i] == 1){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));


        /*Задание 2
        Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */


        /*Вариант решения 1 */
        System.out.println("\n");
        int[] arr2 = new int[8];
        int x = 0;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = x;
            x+=3;
        }
        System.out.println(Arrays.toString(arr2));

        /*Вариант решения 2 */
        int[] arr3 = new int[8];
        for(int i = 0, j = 0; i < arr3.length; i++, j+=3){
            arr3[i] = j;
        }
        System.out.println(Arrays.toString(arr3));




        /* Задание 3
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        System.out.println("\n");
        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < arr4.length; i++){
            if (arr4[i] < 6){
                arr4[i] = arr4[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr4));


        /* Задание 4
        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        цикла(-ов) заполнить его диагональные элементы единицами;
         */
        System.out.println("\n");
        int[][] arr5 = new int[4][4];
        for (int i=0; i < arr5.length; i++){
            arr5[i][i] = 1;
            System.out.println(Arrays.toString(arr5[i]));
        }
        System.out.println(Arrays.deepToString(arr5));


        /* Задание 5
        ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
         */
        System.out.println("\n");
        int[] arr6 = {2, 4, 7, 11, 8, 3, 7, 9, 10};
        int min = arr6[0];
        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++){
            if (min > arr6[i] ){
                min = arr6[i];
            }
            if ( max < arr6[i]){
                max = arr6[i];
            }
        }
        System.out.println("Минимальное число массива: " + min + "\nМаксимальное число массива: " + max);
        


        /*
        Задание 7
         **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
         или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи
         нельзя пользоваться вспомогательными массивами.
         */
        System.out.println("\n");
        int[] arr8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr9 = {1, 2, 3, 4, 5, 6, 7}; // Берем для наглядности два массива
        System.out.println(Arrays.toString(arr8)); // выводим стандартный первый массив массим
        System.out.println(Arrays.toString(beasArray(arr8, 5))); // применяем к стандартному первому массиву метод по смещению на 5 элементов
        System.out.println("\n"); // для наглядности пропускаем пустую строчку
        System.out.println(Arrays.toString(arr9)); // выводим стандартный второй массив массим
        System.out.println(Arrays.toString(beasArray(arr9, -3))); // применяем к стандартному второму массиву метод по смещению на -3 элемента



    }



    public static int[] beasArray(int[] arr, int n){
        if (n > 0){
            int count = 0;
            while (n >= count){
                int a = arr[arr.length-1];
                for (int i = (arr.length - 1); i >= 1; i --){
                    arr[i] = arr[i-1];
                }
                arr[0] = a;
                count++;
            }
        }
        if (n < 0){
            int count = 0;
            while (n != count){
                int a = arr[0];
                for (int i = 0; i < arr.length-1; i++){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = a;
                count--;
            }
        }
        return arr;
    }
}
