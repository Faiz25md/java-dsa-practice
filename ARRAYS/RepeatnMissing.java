import java.util.*;

public class RepeatnMissing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int acsum = (n*(n+1))/2;
        int acsq = (n*(n+1)*(2*n+1))/6;
        int sum =0 ;
        int SQsum =0;

        for(int i =0;i<n;i++){
            sum += arr[i];
            SQsum += arr[i]*arr[i];
        }
        int diff = acsum - sum;
        int sqdiff = acsq - SQsum;
        int sumXY = sqdiff/diff;

        int x = (diff + sumXY)/2;
        int y = sumXY - x;
        
        System.out.println("Repeating: " + y);
        System.out.println("Missing: " + x);
    }
}