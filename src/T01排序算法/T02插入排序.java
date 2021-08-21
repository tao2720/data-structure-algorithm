package T01排序算法;

import java.util.Arrays;

public class T02插入排序 {

    public static void main(String[] args) {
        int[] arr={70,30,40,10,80,20,90,100,75,60,45};
        InsertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i;
            while(j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }


        return arr;
    }
}
