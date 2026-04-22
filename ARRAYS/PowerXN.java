// public class PowerXN {
//     public static double power(double x, int n) {
//         if(n == 0) return 1;
        
//         double half = power(x, n/2);
        
//         if(n % 2 == 0)
//             return half * half;
//         else
//             return half * half * x;
//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 3));
//     }
// }

import java.util.*;
public class PowerXN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x =sc.nextInt();

        if(x==0){
            System.out.println(1);
        }else{
        double power = Math.pow(n,x);
        System.out.println(power);
        }
    }
}