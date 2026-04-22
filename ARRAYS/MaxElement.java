import java.util.*;
public class MaxElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i =0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<x;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}