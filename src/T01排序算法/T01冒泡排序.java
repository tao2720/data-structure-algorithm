package T01排序算法;

import java.util.Arrays;

public class T01冒泡排序 {
    public static void main(String[] args) {
        int[] arr={3,6,4,2,11,10,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return arr;
    }
}
