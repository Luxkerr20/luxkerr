package LAB01;

import java.util.Arrays;
import java.util.Scanner;
public class N2 {
    public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    double sum = 0;
    int i = 0;
    int[] arr = new int[10];
    while ( i < arr.length) {
        arr[i] = Scan.nextInt();
        sum += arr[i];
        i++;
    }
    Arrays.sort(arr);
    double  avg = (double) sum/arr.length;
    System.out.println("Сумма массива: " + sum);
    System.out.println("Среднее арифметическое: " + avg);
    System.out.println("Минимальное число в массиве: " + arr[0]);
    System.out.println("Максимальное число в массиве: " + arr[arr.length-1]);
    }
}
