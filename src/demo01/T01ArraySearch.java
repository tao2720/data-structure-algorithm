package demo01;

public class T01ArraySearch {


    public static void main(String[] args) {

        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int target=5;
        int begin=0;
        int end=arr.length-1;
        int mid=(begin+end)/2;
        int index=-1;

        while(true){
            if (arr[mid]==target){
                index=mid;
                break;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if (arr[mid]<target){
                begin=mid+1;
            }
            mid=(begin+end)/2;
        }
        System.out.println("index:"+index);
    }


}
