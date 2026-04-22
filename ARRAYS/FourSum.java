import java.util.*;
public class FourSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j = i+1 ;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int left = j+1;
                int right = n-1;

                while(left<right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==t){
                        res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        while(left<right && arr[left]==arr[left+1]){
                            left++;
                        }
                        while(left<right && arr[right]==arr[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<0){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }System.out.print(res);
        
    }
}