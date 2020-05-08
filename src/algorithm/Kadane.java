package algorithm;

import java.util.Scanner;

public class Kadane {
    public static void main(String[] args){
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt ();
        }

        int max_subarray_size=arr[0];
        int sum=0;

        for(int i=0;i<size;i++){
            sum=sum+arr[i];
            if(max_subarray_size<sum){
                max_subarray_size=sum;
            }
            else if(sum<0){
                sum=0;
            }
        }
        System.out.println (max_subarray_size);
    }
}
