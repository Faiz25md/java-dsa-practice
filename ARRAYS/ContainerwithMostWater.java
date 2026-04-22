import java.util.*;
public class ContainerwithMostWater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        int Area = 0;

        while(left<right){
            int h = Math.min(arr[left],arr[right]);
            int width = right - left ;

            Area = Math.max(Area,h * width);
            if(left<right){
                left++;
            }else{
                right--;
            }
        }
           System.out.println(Area);
}
}