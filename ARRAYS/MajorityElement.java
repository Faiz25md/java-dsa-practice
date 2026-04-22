import java.util.*;

public class MajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if(map.get(arr[i]) >= n/2){
                System.out.println("Majority: " + arr[i]);
                return;
            }
        }

        System.out.println("No Majority Element");
    }
}