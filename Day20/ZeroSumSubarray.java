package Day20;
import java.util.*;

public class ZeroSumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        // Prefix sum 0 occurs once before starting
        map.put(0, 1);

        for(int i = 0; i < n; i++){

            sum += arr[i];

            if(map.containsKey(sum)){
                count += map.get(sum);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);

        sc.close();
    }
}
