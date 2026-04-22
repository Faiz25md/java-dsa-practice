import java.util.*;

public class GapMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();

        int gap = (n + m + 1) / 2;

        while(gap > 0){
            int i = 0;
            int j = gap;

            while(j < n + m){

                int a = (i < n) ? arr1[i] : arr2[i - n];
                int b = (j < n) ? arr1[j] : arr2[j - n];

                if(a > b){
                    if(i < n && j < n)
                        swap(arr1, i, j);
                    else if(i < n)
                        swap(arr1, arr2, i, j - n);
                    else
                        swap(arr2, i - n, j - n);
                }

                i++;
                j++;
            }

            if(gap == 1)
                break;

            gap = (gap + 1) / 2;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(int[] arr1, int[] arr2, int i, int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}