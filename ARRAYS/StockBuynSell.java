import java.util.*;
public class StockBuynSell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                max = Math.max(max,prices[i]-min);
            }
        }
        System.out.println("Max Profit : " + max);
    }
}