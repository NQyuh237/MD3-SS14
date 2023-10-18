package bt.bt3;

import java.util.Arrays;

public class DictionarySort {
    public static void main(String[] args) {
        String[] arr = {"chuối", "táo", "cam", "nho", "lê"};

        System.out.println("Mảng gốc:");
        System.out.println(Arrays.toString(arr));

        String[] sortedArray1 = bubbleSort(arr.clone());
        System.out.println("\nSắp xếp mảng bằng cách sử dụng Bubble Sort:");
        System.out.println(Arrays.toString(sortedArray1));

        String[] sortedArray2 = selectionSort(arr.clone());
        System.out.println("\nSắp xếp mảng bằng cách sử dụng Sắp xếp lựa chọn:");
        System.out.println(Arrays.toString(sortedArray2));

        String[] sortedArray3 = insertionSort(arr.clone());
        System.out.println("\nSắp xếp mảng bằng cách sử dụng Sắp xếp chèn:");
        System.out.println(Arrays.toString(sortedArray3));
    }

    public static String[] bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static String[] selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static String[] insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
