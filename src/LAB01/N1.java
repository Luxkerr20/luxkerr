package LAB01;
import java.util.*;
public class N1 {
    public static void main(String[] args) {
    double sum = 0;
    int[] arr = {1, 2, 3, 4 ,5};
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    double  avg = (double) sum/arr.length;
    System.out.println("Сумма массива: " + sum);
    System.out.println("Среднее арифметическое: " + avg);
}}