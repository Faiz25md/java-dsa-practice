import java.util.*;
public class Kadane{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum=arr[0];
        int currSum=0;

        for(int i=0;i<n;i++){
            currSum+=arr[i];

            maxSum= Math.max(maxSum,currSum);

            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("Max Sum of Subarray is :"+maxSum);
    }
}