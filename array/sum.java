package array;
import java.util.*;

class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 0;
        int sum = 0;
        for (i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i <= 4; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        sc.close();
    }

}