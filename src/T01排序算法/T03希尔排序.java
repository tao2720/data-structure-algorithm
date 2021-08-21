package T01排序算法;

import java.util.Arrays;

public class T03希尔排序 {

    public static void main(String[] args) {
        int[] arr={26,53,67,48,57,13,48,32,60,50};
        ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] ShellSort(int[] arr) {
        for (int gap = arr.length/2; gap >0; gap/=2) {
            for (int i=gap;i<arr.length;i++){
                int temp=arr[i];
                int j=i;
                if(arr[j]<arr[j-1]){
                    while (j-gap>=0&&temp<arr[j-gap]){
                        arr[j]=arr[j-gap];
                        j-=gap;
                    }
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }
}
